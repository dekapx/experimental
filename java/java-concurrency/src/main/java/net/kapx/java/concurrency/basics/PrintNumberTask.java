package net.kapx.java.concurrency.basics;

import java.util.concurrent.TimeUnit;

public class PrintNumberTask implements Runnable {
    @Override
    public void run() {
        for (int i = 1;i <=5; i ++) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        final PrintNumberTask printNumberTask = new PrintNumberTask();
        new Thread(printNumberTask).start();
    }
}
