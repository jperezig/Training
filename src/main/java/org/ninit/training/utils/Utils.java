package org.ninit.training.utils;

import java.util.Random;
import java.util.Scanner;

public class Utils {

    public static int[] getRandom(int size) {
        int[] numbers = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt(100);
        }
        return numbers;
    }

    public static int[] getRandomWithNegatives(int size, int range) {
        int[] numbers = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            if (random.nextBoolean()) {
                numbers[i] = random.nextInt(range);
            } else {
                numbers[i] = -random.nextInt(range);
            }
        }
        return numbers;
    }

    public static int[] toInt(String[] numbers) {
        int[] result = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            result[i] = Integer.valueOf(numbers[i]);
        }

        return result;
    }

    public static void read() {
        int[] numbers;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        scanner.close();
    }
}
