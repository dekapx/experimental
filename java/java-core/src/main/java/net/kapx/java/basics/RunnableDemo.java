package net.kapx.java.basics;

import java.util.concurrent.TimeUnit;

public class RunnableDemo {
    public static void main(String[] args) {
    }


    private static void runnableSimple() {
        final Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i =0; i <5; i ++) {
                    System.out.print((i + 1) + " ");
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        new Thread(runnable).start();
    }
}
