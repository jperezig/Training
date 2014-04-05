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
