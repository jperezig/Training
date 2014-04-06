package org.ninit.training.search;

import java.util.Arrays;

import org.ninit.training.utils.Utils;

public class MaxSubArray {

    public static int[] findMaxSubArray(int[] array) {
        if (array.length == 0) {
            return array;
        }
        int maxSoFar = array[0];
        int maxHere = array[0];
        int subArrayStart = 0;
        int subArrayTemStart = 0;
        int subArrayEnd = 0;

        for (int i = 1; i < array.length; i++) {
            if (maxHere < 0) {
                maxHere = array[i];
                subArrayTemStart = i;
            } else {
                maxHere += array[i];
            }

            if (maxHere >= maxSoFar) {
                maxSoFar = maxHere;
                subArrayStart = subArrayTemStart;
                subArrayEnd = i;
            }
        }
        return Arrays.copyOfRange(array, subArrayStart, subArrayEnd + 1);
    }

    public static void main(String args[]) {
        int[] input = Utils.getRandomWithNegatives(10, 10);
        System.out.println(Arrays.toString(input));
        System.out.println(Arrays.toString(findMaxSubArray(input)));
    }
}
