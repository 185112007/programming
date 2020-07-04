package util;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.DoubleAdder;
import java.util.function.DoubleFunction;

public class Integral {

	public static final int STEPS = 1000_000;
	public static final int TASKS = 10;

	// y = f(x)
	public static double singleThread(DoubleFunction<Double> func, double a, double b) {
		return singleThread(func, a, b, STEPS);
	}

	// y = f(x)
	static double singleThread(DoubleFunction<Double> func, double a, double b, int steps) {
		double h = (b - a) / steps;
		double result = 0d;

		for (int i = 0; i < steps; i++) {
			double x = a + h * i + h / 2;
			double y = func.apply(x);
			result += y * h;
		}

		return result;
	}

	// y = f(x)
	public static double multyThread(DoubleFunction<Double> func, double a, double b)
			throws InterruptedException, ExecutionException {
		ExecutorService pool = Executors.newFixedThreadPool(TASKS);

		double hx = (b - a) / TASKS;

		Future<Double>[] tasks = new Future[TASKS];

		for (int i = 0; i < TASKS; i++) {
			final double ax = a + i * hx;
			final double bx = ax + hx;
			tasks[i] = pool.submit(() -> Integral.singleThread(func, ax, bx, STEPS / TASKS));
		}

		double sum = 0d;

		for (Future<Double> t : tasks) {
			sum += t.get();
		}

		pool.shutdown();

		return sum;
	}

	// y = f(x)
	public static double multyThread2(DoubleFunction<Double> func, double a, double b)
			throws InterruptedException, ExecutionException {
		ExecutorService pool = Executors.newFixedThreadPool(TASKS);

		double hx = (b - a) / TASKS;

		Thread[] tasks = new Thread[TASKS];

		DoubleAdder r = new DoubleAdder();

		for (int i = 0; i < TASKS; i++) {
			final double ax = a + i * hx;
			final double bx = ax + hx;
			tasks[i] = new Thread(() -> {
				double rx = Integral.singleThread(func, ax, bx, STEPS / TASKS);
				r.add(rx);
			});
			tasks[i].start();
		}

		for (Thread t : tasks) {
			t.join();
		}

		return r.sum();
	}
}
