package org.ninit.training.dynamic.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.ninit.training.dynamic.Fibonacci;

public class FibonacciTest {

    @Test
    public void testFibonnaci1() {
        assertEquals("Fibonnacci1(0)", 0, Fibonacci.fib1(0));
        assertEquals("Fibonnacci1(1)", 1, Fibonacci.fib1(1));
        assertEquals("Fibonnacci1(19)", 4181, Fibonacci.fib1(19));
        assertEquals("Fibonnacci1(20)", 6765, Fibonacci.fib1(20));
    }

    @Test
    public void testFibonacci2() {
        assertEquals("Fibonnacci2(0)", 0, Fibonacci.fib2(0));
        assertEquals("Fibonnacci2(1)", 1, Fibonacci.fib2(1));
        assertEquals("Fibonnacci2(19)", 4181, Fibonacci.fib2(19));
        assertEquals("Fibonnacci2(20)", 6765, Fibonacci.fib2(20));
    }

    @Test
    public void testFibonnacci3() {
        assertEquals("Fibonnacci3(0)", 0, Fibonacci.fib3(0));
        assertEquals("Fibonnacci3(1)", 1, Fibonacci.fib3(1));
        assertEquals("Fibonnacci3(19)", 4181, Fibonacci.fib3(19));
        assertEquals("Fibonnacci3(20)", 6765, Fibonacci.fib3(20));
    }
}
