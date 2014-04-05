package org.ninit.training.search;

public class QuickSelect {

    public QuickSelect() {

    }

    public int findElement(int[] input, int nElement) {
        return partition(0, input.length - 1, input, nElement);
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

    public int partition(int left, int right, int[] numbers, int n) {
        if (right - left < 2) {
            return numbers[left];
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
        pivot = lastMovedElement;
        if (pivot == n) {
            return numbers[pivot];
        } else if (pivot > n) {
            return partition(left, pivot - 1, numbers, n);
        } else {
            return partition(pivot + 1, right, numbers, n);
        }

    }
}
