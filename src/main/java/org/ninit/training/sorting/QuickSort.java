package org.ninit.training.sorting;

import org.ninit.training.utils.Utils;

public class QuickSort {

	private static int rec = 0;

	public static void sort(int[] numbers) {

		partition(0, numbers.length - 1, numbers);
		System.out.println(numbers);

	}

	public static void partition(int left, int right, int[] numbers) {
		System.out.println(rec++);
		System.out.println(right - left);
		if (right - left < 2) {
			return;
		}
		int pivot = choosePivot(left, right, numbers);
		int pivotValue = numbers[pivot];
		swapElements(numbers, pivot, right);
		int lastMovedElement = left;
		for (int i = left; i < right; i++) {
			if (numbers[i] < pivotValue) {
				swapElements(numbers, i, lastMovedElement);
				lastMovedElement++;
			}
		}
		swapElements(numbers, right, lastMovedElement);
		partition(left, lastMovedElement - 1, numbers);
		partition(lastMovedElement + 1, right, numbers);

	}

	public static int choosePivot(int left, int right, int[] numbers) {
		return left + ((right - left) / 2);
	}

	public static int[] swapElements(int[] numbers, int a, int b) {
		if (a == b || numbers[a] == numbers[b]) {
			return numbers;
		}
		numbers[a] = numbers[a] + numbers[b];
		numbers[b] = numbers[a] - numbers[b];
		numbers[a] = numbers[a] - numbers[b];
		return numbers;
	}

	public static void main(String args[]) {
		sort(Utils.getRandom(100000));

	}
}
