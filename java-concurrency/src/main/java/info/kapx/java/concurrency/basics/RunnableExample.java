package info.kapx.java.concurrency.basics;

import java.util.concurrent.TimeUnit;

public class RunnableExample {

	private static Runnable task = new Runnable() {

		@Override
		public void run() {
			System.out.println("executing runnable...");
			try {
				for (int i = 0; i < 5; i++) {
					System.out.print(i + " ");
					TimeUnit.SECONDS.sleep(2);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	};

	public static void main(String[] args) {
		new Thread(task).start();
	}
}
