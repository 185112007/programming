package threads;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class _01_MyThread extends Thread {

	// basic realization Lock(like synchronized)
	private static Lock lock = new ReentrantLock();

	@Override
	public void run() {

		try {
			// or we can use just lock.lock() method for lock
			while (!lock.tryLock(1, TimeUnit.MILLISECONDS)) {
				System.out.println("Waiting......");
			}

			for (int i = 0; i < 100; i++) {
				System.out.printf("%s - %d\n", this.getName(), i);
			}

		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		} finally {
			lock.unlock();
		}

	}
}
