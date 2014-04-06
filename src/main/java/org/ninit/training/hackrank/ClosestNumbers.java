package org.ninit.training.hackrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.ninit.training.sorting.QuickSort;
import org.ninit.training.utils.Utils;

public class ClosestNumbers {

    public static int[] findClosestNumbers(int[] input) {
        List<Integer> result = new ArrayList<Integer>();
        if (input.length == 0) {
            return new int[] {};
        }
        QuickSort qs = new QuickSort();
        qs.sort(input);
        int minDistance = Integer.MAX_VALUE;
        for (int i = 1; i < input.length; i++) {

            if (Math.abs(input[i - 1] - input[i]) == minDistance) {
                result.add(input[i - 1]);
                result.add(input[i]);
            } else if (Math.abs(input[i - 1] - input[i]) < minDistance) {
                minDistance = Math.abs(input[i - 1] - input[i]);
                result.clear();
                result.add(input[i - 1]);
                result.add(input[i]);
            }
        }
        return Utils.toPrimitives(result);
    }

    public static void main(String[] args) {
        int[] input = Utils.getRandomWithNegatives(10, 10000);
        System.out.println(Arrays.toString(input));
        int[] result = findClosestNumbers(input);
        System.out.println(Arrays.toString(result));
    }
}
