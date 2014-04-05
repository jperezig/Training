package org.ninit.training.sorting;

public class QuickSort implements Sorteable {

    public void sort(int[] input) {
        partition(0, input.length - 1, input);
    }

    public void partition(int left, int right, int[] numbers) {
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

    public int choosePivot(int left, int right, int[] numbers) {
        return left + ((right - left) / 2);
    }

    public int[] swapElements(int[] numbers, int a, int b) {
        if (a == b || numbers[a] == numbers[b]) {
            return numbers;
        }
        numbers[a] = numbers[a] + numbers[b];
        numbers[b] = numbers[a] - numbers[b];
        numbers[a] = numbers[a] - numbers[b];
        return numbers;
    }
}
