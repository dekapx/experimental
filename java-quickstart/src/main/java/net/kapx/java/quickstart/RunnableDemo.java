package net.kapx.java.quickstart;

public class RunnableDemo {
    public static void main(String[] args) {
        final Runnable runnable = () -> {
            System.out.println("Running in a thread -> " + Thread.currentThread().getName());
        };

        new Thread(runnable).start();
    }
}
