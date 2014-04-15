package info.kapx.java.concurrency.join;

public class ThreadJoinExample {
	public static void main(String[] args) throws Exception {
		Runnable threadA = new ThreadA();
		Runnable threadB = new ThreadB();
		Runnable threadC = new ThreadC();

		Thread t1 = new Thread(threadA);
		t1.start();
		t1.join();

		Thread t2 = new Thread(threadB);
		t2.start();
		t2.join();

		Thread t3 = new Thread(threadC);
		t3.start();
		t3.join();
	}
}
