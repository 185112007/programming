package callable;

import java.util.concurrent.Callable;

public class MyCallTask2 implements Callable<Long> {

	@Override
	public Long call() throws Exception {
		
		System.out.println(Thread.currentThread().getName());
		
		Thread.sleep(10000);
		
		long sum = 0;
		for (int i = 1; i <= 100_000_000L; i++) {
			sum += i;
		}
		return sum;
	}
	
}
