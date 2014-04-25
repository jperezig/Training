package org.ninit.training.sorting.counting;

import java.util.Scanner;

public class CountingSort {

    public static int[] countingSort1(int[] input, int min, int max) {
        int[] result = new int[max - min];
        for (int i = 0; i < input.length; i++) {
            result[input[i]] = result[input[i]] + 1;
        }
        return result;
    }

    public static int[] countingSort2(int[] input, int min, int max) {
        int[] result = countingSort1(input, min, max);
        for (int i = 0; i < result.length; i++) {
            int val = result[i];
            while (val > 0) {
                System.out.print(i + " ");
                val--;
            }
        }

        return result;
    }

    public static int[] read() {
        int[] numbers;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        scanner.close();
        return numbers;
    }

    public static void main(String[] args) {
        countingSort2(read(), 0, 100);
    }
}
