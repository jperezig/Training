package org.ninit.training.search.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.ninit.training.search.MaxSubArray;

public class MaxSubArrayTest {

    private static int[] input1 = { 1, 2, 3, 4, 5, 6 };
    private static int[] output1 = { 1, 2, 3, 4, 5, 6 };

    private static int[] input2 = {};
    private static int[] output2 = {};

    private static int[] input3 = { -1, -2, -3, -4, -5, 6 };
    private static int[] output3 = { 6 };

    private static int[] input4 = { 3, -2, 3, -4, -5, -6 };
    private static int[] output4 = { 3, -2, 3 };

    private static int[] input5 = { 1000, -2, -3, -4, -5, 1000 };
    private static int[] output5 = { 1000, -2, -3, -4, -5, 1000 };

    @Test
    public void test() {
        assertArrayEquals(output1, MaxSubArray.findMaxSubArray(input1));
        assertArrayEquals(output2, MaxSubArray.findMaxSubArray(input2));
        assertArrayEquals(output3, MaxSubArray.findMaxSubArray(input3));
        assertArrayEquals(output4, MaxSubArray.findMaxSubArray(input4));
        assertArrayEquals(output5, MaxSubArray.findMaxSubArray(input5));
    }

}
