package org.ninit.training.sorting;

public class QuickSort implements Sorteable {

    public void sort(int[] input) {
        partition(0, input.length, input);
    }

    private void partition(int left, int right, int[] numbers) {
        if (right - left <= 1) {
            return;
        }
        int pivot = choosePivot(left, right, numbers);
        int pivotValue = numbers[pivot];
        swapElements(numbers, pivot, right - 1);
        int lastMovedElement = left;
        for (int i = left; i < right; i++) {
            if (numbers[i] < pivotValue) {
                swapElements(numbers, i, lastMovedElement);
                lastMovedElement++;
            }
        }
        swapElements(numbers, right - 1, lastMovedElement);
        partition(left, lastMovedElement, numbers);
        partition(lastMovedElement + 1, right, numbers);

    }

    private int choosePivot(int left, int right, int[] numbers) {
        return left + ((right - left) / 2);
    }

    private int[] swapElements(int[] numbers, int a, int b) {
        if (a == b || numbers[a] == numbers[b]) {
            return numbers;
        }
        numbers[a] = numbers[a] + numbers[b];
        numbers[b] = numbers[a] - numbers[b];
        numbers[a] = numbers[a] - numbers[b];
        return numbers;
    }
}
