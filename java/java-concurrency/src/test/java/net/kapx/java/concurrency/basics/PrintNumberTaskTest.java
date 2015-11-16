package net.kapx.java.concurrency.basics;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PrintNumberTaskTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void run_printNumbers() {
        final PrintNumberTask printNumberTask = new PrintNumberTask();
        new Thread(printNumberTask).start();
    }
}
