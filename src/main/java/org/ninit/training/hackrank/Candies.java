package org.ninit.training.hackrank;

public class Candies {

    public static int solve(int[] numbers) {
        int[] leftPass = new int[numbers.length];
        int[] rightPass = new int[numbers.length];
        rightPass[0] = 1;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] < numbers[i + 1]) {
                rightPass[i + 1] = rightPass[i] + 1;
            } else {
                rightPass[i + 1] = 1;
            }
        }

        leftPass[leftPass.length - 1] = 1;

        for (int i = leftPass.length - 1; i > 0; i--) {
            if (numbers[i - 1] > numbers[i]) {
                leftPass[i - 1] = leftPass[i] + 1;
            } else {
                leftPass[i - 1] = 1;
            }
        }
        int total = 0;
        for (int i = 0; i < leftPass.length; i++) {
            int max = Math.max(leftPass[i], rightPass[i]);
            total += max;
            System.out.println(numbers[i] + "->" + max);
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println("Total:"
                + solve(new int[] { 5, 4, 3, 2, 2, 5, 99, 1, 3, 3 }));
    }

}
