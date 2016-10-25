package com.kapx.java.tdd.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class EuroTest {

    @Test
    public void testMultiplication() throws Exception {
        final Euro euro = new Euro(5);
        assertEquals(10, euro.times(2));
    }

    @Test
    public void testEquality() {
        assertTrue(new Euro(5).equals(new Euro(5)));
    }

}
