package main;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

import tree.TreeNode;

public class App1 {

	static Random rnd = new Random();
	static int total;
	
	public static void main(String[] args) {
		{// 1. single thread
			System.out.println("----1. single thread:----");
			int treeLevel = 22;
			
			System.out.printf("Starting tree creation with depth %d...\n", treeLevel);
			TreeNode root = new TreeNode();
			createRandomTree(root, treeLevel);
			System.out.printf("Tree created with total weight: %d\n", total);
			
			// PROFILING
			weightTree(root);
			weightTree(root);
			
			long t1 = System.currentTimeMillis();
			int r1 = weightTree(root);
			long t2 = System.currentTimeMillis();
			System.out.printf("Single weight: %d, Time: %d\n", r1, t2-t1);
		}
		
		{// 2. multi thread
			System.out.println("----2. multi thread:----");
			int treeLevel = 22;
			
			System.out.printf("Starting tree creation with depth %d...\n", treeLevel);
			TreeNode root = new TreeNode();
			createRandomTree(root, treeLevel);
			System.out.printf("Tree created with total weight: %d\n", total);
			
			// PROFILING
			weightTree(root);
			weightTree(root);
			
			long t1 = System.currentTimeMillis();
			int r1 = weightTreeMulti(root);
			long t2 = System.currentTimeMillis();
			System.out.printf("Multi weight: %d, Time: %d\n", r1, t2-t1);
		}
	}

	public static void createRandomTree(TreeNode node, int level) {
		node.left = new TreeNode();
		node.right = new TreeNode();
		node.weight = node.weight;
		
		level--;
		
		if (level == 0) {
			node.left.weight = rnd.nextInt(100);
			node.right.weight = rnd.nextInt(100);
			total += node.left.weight;
			total += node.right.weight;
			return;
		}
		createRandomTree(node.left, level);
		createRandomTree(node.right, level);
	}
	
	// single threaded
	public static int weightTree(TreeNode root) {
		return root.weight + 
			   (root.left != null ? weightTree(root.left):0) + 
			   (root.right != null ? weightTree(root.right):0);
	}
	
	// multy threaded
	public static int weightTreeMulti(TreeNode root) {
		class WeightCounter extends RecursiveTask<Integer>{
			
			TreeNode r;
			int level;
			
			public WeightCounter(TreeNode n, int level) {
				this.r = n;
				this.level = level;
			}
			
			@Override
			protected Integer compute() {
				final int newLevel = level - 1;
				if(level <= 0) return weightTree(r);
				
				int sum = r.weight;
				WeightCounter w1 = null, w2 = null;
				if (r.left != null) {
					w1 = new WeightCounter(r.left, newLevel);
					w1.fork();	
				}
				if (r.right != null) {
					w2 = new WeightCounter(r.right, newLevel);
					w2.fork();
				}
				if (w1 != null) {
					sum += w1.join();
				}
				if (w2 != null) {
					sum += w2.join();
				}
				return sum;
			}
			
		}
		
		return ForkJoinPool.
				commonPool().
				invoke(
						new WeightCounter(root, Runtime.getRuntime().availableProcessors())
						);
	}
}
