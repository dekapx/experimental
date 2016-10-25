package net.kapx.java.quickstart;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CallableDemo {
    public static void main(String[] args) {
        final Callable<Void> callable = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.print(i + " ");
                TimeUnit.SECONDS.sleep(1);
            }
            return null;
        };

        final ExecutorService executorService = Executors.newFixedThreadPool(1);
        executorService.submit(callable);
        executorService.shutdown();
    }
}
