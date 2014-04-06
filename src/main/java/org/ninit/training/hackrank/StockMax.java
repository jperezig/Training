package org.ninit.training.hackrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.ninit.training.utils.Utils;

public class StockMax {

    public static int operate(int[] prices) {
        int shares = 0;
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {
            int max = max(Arrays.copyOfRange(prices, i + 1, prices.length));
            if (max > prices[i]) {
                shares++;
                profit = profit - prices[i];
            } else {
                while (shares > 0) {
                    shares--;
                    profit = profit + prices[i];
                }
            }
        }

        return profit;
    }

    public static int max(int[] numbers) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        List<int[]> cases = new ArrayList<int[]>();
        for (int i = 0; i < testCases; i++) {
            scanner.nextInt();
            String line = "";
            while (line.trim().length() < 1) {
                line = scanner.nextLine();
            }
            cases.add(Utils.toInt(line.trim().split(" ")));
        }
        scanner.close();
        for (int[] c : cases) {
            System.out.println(operate(c));
        }
    }

}
