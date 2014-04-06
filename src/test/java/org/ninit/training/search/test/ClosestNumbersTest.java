package org.ninit.training.search.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.ninit.training.hackrank.ClosestNumbers;

public class ClosestNumbersTest {

    private static int[] input1 = { 1, 2, 3, 4, 5, 6 };
    private static int[] output1 = { 1, 2, 2, 3, 3, 4, 4, 5, 5, 6 };

    private static int[] input2 = {};
    private static int[] output2 = {};

    private static int[] input3 = { -1, -2, -3, -4, -5, 6 };
    private static int[] output3 = { -5, -4, -4, -3, -3, -2, -2, -1 };

    private static int[] input4 = { 0, -2, 3, -4, -5, 0 };
    private static int[] output4 = { 0, 0 };

    private static int[] input5 = { 1000, 900, 800, 699, 598, 1100 };
    private static int[] output5 = { 800, 900, 900, 1000, 1000, 1100 };

    @Test
    public void testFindClosestNumbers() {
        assertArrayEquals(ClosestNumbers.findClosestNumbers(input1), output1);
        assertArrayEquals(ClosestNumbers.findClosestNumbers(input2), output2);
        assertArrayEquals(ClosestNumbers.findClosestNumbers(input3), output3);
        assertArrayEquals(ClosestNumbers.findClosestNumbers(input4), output4);
        assertArrayEquals(ClosestNumbers.findClosestNumbers(input5), output5);

    }

}
