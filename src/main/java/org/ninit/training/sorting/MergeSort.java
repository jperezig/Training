package org.ninit.training.sorting;

import java.util.Arrays;

public class MergeSort implements Sorteable{

	private int[] numbers;

	public void sort(int[] input) {
		this.numbers = input;
		mergeSort(0, input.length);
	}

	public int size() {
		return numbers.length;
	}

	private int middle(int left, int right) {
		return left + (right - left) / 2;
	}

	public void mergeSort(int left, int right) {
		if ((left + 1) == right) {
			return;
		}
		mergeSort(left, middle(left, right));
		mergeSort(middle(left, right), right);
		merge(left, right, middle(left, right));

	}

	public void merge(int left, int right, int middle) {
		int[] merged = merge(Arrays.copyOfRange(numbers, left, middle),
				Arrays.copyOfRange(numbers, middle, right));
		for (int i = 0; i < merged.length; i++) {
			numbers[left + i] = merged[i];
		}
	}

	// Join two sorted arrays
	private int[] merge(int[] a, int[] b) {
		int[] answer = new int[a.length + b.length];

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				answer[k++] = a[i++];
			} else {
				answer[k++] = b[j++];
			}
		}

		while (i < a.length) {
			answer[k++] = a[i++];
		}
		while (j < b.length) {
			answer[k++] = b[j++];
		}

		return answer;
	}
}
