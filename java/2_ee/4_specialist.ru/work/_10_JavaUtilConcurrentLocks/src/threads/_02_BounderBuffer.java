package threads;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class _02_BounderBuffer {
	
	final Lock lock = new ReentrantLock();
	final Condition notFull = lock.newCondition();
	final Condition notEmpty = lock.newCondition();
	
	final Object[] items = new Object[100];
	int putptr, takeptr, count;
	
	public void put(Object x) {
		lock.lock();
		try {
			while (count == items.length) {
				notFull.await();	// analog wait()
			}
			items[putptr] = x;
			if (++putptr == items.length) {
				putptr = 0;
			}
			++count;
			notEmpty.signal();		// analog notify()
			System.out.printf("Thread %s has put and signal data: %s\n",
					Thread.currentThread().getName(), x);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.printf("Thread %s unlock\n", Thread.currentThread().getName());
			lock.unlock();
		}
	}
	
	public Object take() {
		lock.lock();
		try {
			while (count == 0) {
				System.out.printf("Thread %s take waiting...\n", 
						Thread.currentThread().getName());
				notEmpty.await();
			}
			System.out.printf("Thread %s is going to take data\n", 
					Thread.currentThread().getName());
			
			Object x = items[takeptr];
			if (++takeptr == items.length) {
				takeptr = 0;
			}
			--count;
			notFull.signal();
			return x;
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
			return null;
		} finally {
			System.out.printf("Thread %s unlock\n", Thread.currentThread().getName());
			lock.unlock();
		}
	}
}
