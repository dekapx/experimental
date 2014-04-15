package info.kapx.java.concurrency.join;

import java.util.concurrent.TimeUnit;

public class ThreadC implements Runnable {

	@Override
	public void run() {
		System.out.println("\nThreadC executing...");
		try {
			for (int i = 0; i < 5; i++) {
				System.out.print((i + 1) + " ");
				TimeUnit.SECONDS.sleep(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
