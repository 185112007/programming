package callable;

import java.util.concurrent.Callable;

public class MyCallTask implements Callable<Long> {

	@Override
	public Long call() throws Exception {
		
		System.out.println(Thread.currentThread().getName());
		
		long sum = 0;
		for (int i = 1; i <= 100_000_000L; i++) {
			sum += i;
		}
		return sum;
	}
	
}
