package org.ninit.training.sorting.counting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FullCountingSort {

    private static void init(List<List<String>> input, int size) {
        for (int i = 0; i < size; i++) {
            input.add(new ArrayList<String>());
        }
    }

    public static List<List<String>> read() {
        List<List<String>> input = new ArrayList<List<String>>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        init(input, n);
        for (int i = 0; i < n; i++) {
            int index = scanner.nextInt();
            String val = scanner.next();
            if (i < n / 2) {
                val = "-";
            }
            if (input.get(i) == null) {
                input.set(i, new ArrayList<String>());
            } else {
                input.get(index).add(val);
            }

        }
        scanner.close();
        return input;
    }

    public static void main(String[] args) {
        List<List<String>> input = read();
        for (List<String> list : input) {
            for (String s : list) {
                System.out.print(s + " ");
            }
        }
        System.out.println();
    }
}
