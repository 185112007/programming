package main;

import java.util.concurrent.*;

import callable.MyCallTask;
import callable.MyCallTask2;

public class App1 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		{// 1.Callable, ExecutorService, Executors, SingleThreadExecutor(pool)
			System.out.println("----1. Callable, ExecutorService, Executors, SingleThreadExecutor(pool):----");
			// create pool
			ExecutorService pool = Executors.newSingleThreadExecutor();
			
			long t1 = System.currentTimeMillis();
			
			// submit task
			Future<Long> task = pool.submit(new MyCallTask());
			
			// getting result
			System.out.println(task.get());
			
			long t2 = System.currentTimeMillis();
			System.out.printf("Time (ms): %d\n",t2-t1);
			
			// wait all task to finish & terminate
			pool.shutdown();
		}
		
		{// 2. ten tasks in pool
			System.out.println("\n----2. ten tasks in single thread pool:----");
			// create pool
			ExecutorService pool = Executors.newSingleThreadExecutor();
			
			long t1 = System.currentTimeMillis();
			
			Future[] tasks = new Future[10];
			for (int i = 0; i < 10; i++) {
				// submit task
				tasks[i] = pool.submit(new MyCallTask());
			}
			
			for (Future t : tasks) {
				// getting result
				System.out.println(t.get());
			}
			
			long t2 = System.currentTimeMillis();
			System.out.printf("Time (ms): %d\n",t2-t1);
			
			// wait all task to finish & terminate
			pool.shutdown();
		}
		
		{// 3. FixedThreadPool
			System.out.println("\n----3. FixedThreadPool:----");
			// create pool
			ExecutorService pool = Executors.newFixedThreadPool(5);
			
			long t1 = System.currentTimeMillis();
			
			Future[] tasks = new Future[10];
			for (int i = 0; i < 10; i++) {
				// submit task
				tasks[i] = pool.submit(new MyCallTask());
			}
			
			for (Future t : tasks) {
				// getting result
				System.out.println(t.get());
			}
			
			long t2 = System.currentTimeMillis();
			System.out.printf("Time (ms): %d\n",t2-t1);
			
			// wait all task to finish & terminate
			pool.shutdown();
		}
		
		{// 4. CachedThreadPool
			System.out.println("\n----4. CachedThreadPool:----");
			// create pool
			ExecutorService pool = Executors.newCachedThreadPool();
			
			long t1 = System.currentTimeMillis();
			
			Future[] tasks = new Future[10];
			for (int i = 0; i < 10; i++) {
				// submit task
				tasks[i] = pool.submit(new MyCallTask());
			}
			
			Future<Long> t11 = pool.submit(new MyCallTask());
			Future<Long> t12 = pool.submit(new MyCallTask());
			
			for (Future t : tasks) {
				// getting result
				System.out.println(t.get());
			}
			
			System.out.println(t11.get());
			System.out.println(t12.get());
			
			long t2 = System.currentTimeMillis();
			System.out.printf("Time (ms): %d\n",t2-t1);
			
			// wait all task to finish & terminate
			pool.shutdown();
		}
		
		{// 5. CachedThreadPool, add task after wait 1000ms
			System.out.println("\n----5. CachedThreadPool, add task after wait 1000ms:----");
			// create pool
			ExecutorService pool = Executors.newCachedThreadPool();
			
			long t1 = System.currentTimeMillis();
			
			Future[] tasks = new Future[10];
			for (int i = 0; i < 10; i++) {
				// submit task
				tasks[i] = pool.submit(new MyCallTask());
			}
			
			Thread.sleep(1000);
			
			Future<Long> t11 = pool.submit(new MyCallTask());
			Future<Long> t12 = pool.submit(new MyCallTask());
			
			for (Future t : tasks) {
				// getting result
				System.out.println(t.get());
			}
			
			System.out.println(t11.get());
			System.out.println(t12.get());
			
			long t2 = System.currentTimeMillis();
			System.out.printf("Time (ms): %d\n",t2-t1);
			
			// wait all task to finish & terminate
			pool.shutdown();
		}
		
		{// 6. CachedThreadPool, add task after 60s
			System.out.println("\n----6. CachedThreadPool, add task after 60s:----");
			// create pool
			ExecutorService pool = Executors.newCachedThreadPool();
			
			long t1 = System.currentTimeMillis();
			
			Future[] tasks = new Future[10];
			for (int i = 0; i < 10; i++) {
				// submit task
				tasks[i] = pool.submit(new MyCallTask());
			}
			
//			Thread.sleep(70000);	// wait 70s
									// all threads removed after 60s
			
			// for these tasks creates new threads
			Future<Long> t11 = pool.submit(new MyCallTask());
			Future<Long> t12 = pool.submit(new MyCallTask());
			
			for (Future t : tasks) {
				// getting result
				System.out.println(t.get());
			}
			
			System.out.println(t11.get());
			System.out.println(t12.get());
			
			long t2 = System.currentTimeMillis();
			System.out.printf("Time (ms): %d\n",t2-t1);
			
			// wait all task to finish & terminate
			// after shutdown pool reject new tasks & throws Exception
			pool.shutdown();
		}
		
		{// 7. shutdownNow
			System.out.println("\n----7. shutdownNow:----");
			// create pool
			ExecutorService pool = Executors.newCachedThreadPool();
			
			long t1 = System.currentTimeMillis();
			
			Future[] tasks = new Future[10];
			for (int i = 0; i < 10; i++) {
				// submit task
				tasks[i] = pool.submit(new MyCallTask2());
			}
			
			pool.shutdownNow();
			
			// for these tasks creates new threads
			try {
				Future<Long> t11 = pool.submit(new MyCallTask2());
				Future<Long> t12 = pool.submit(new MyCallTask2());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
		
		{// 8. cancel & isCancelled
			System.out.println("\n----8. cancel & isCancelled:----");
			// create pool
			ExecutorService pool = Executors.newCachedThreadPool();
			
			long t1 = System.currentTimeMillis();
			
			Future[] tasks = new Future[10];
			for (int i = 0; i < 10; i++) {
				// submit task
				tasks[i] = pool.submit(new MyCallTask());
			}
			
			tasks[9].cancel(false);
			
			for (Future t : tasks) {
				if (t.isCancelled()) {
					System.out.println("canceled");
				}else {
					System.out.println(t.get());
				}
			}
			
			pool.shutdown();
		}
		
		{// 9. ten tasks in newWorkStealingPool
			System.out.println("\n----9. ten tasks in newWorkStealingPool:----");
			// create pool
			ExecutorService pool = Executors.newWorkStealingPool();
			
			long t1 = System.currentTimeMillis();
			
			Future[] tasks = new Future[10];
			for (int i = 0; i < 10; i++) {
				// submit task
				tasks[i] = pool.submit(new MyCallTask());
			}
			
			for (Future t : tasks) {
				// getting result
				System.out.println(t.get());
			}
			
			long t2 = System.currentTimeMillis();
			System.out.printf("Time (ms): %d\n",t2-t1);
			
			// wait all task to finish & terminate
			pool.shutdown();
		}
	}

}
