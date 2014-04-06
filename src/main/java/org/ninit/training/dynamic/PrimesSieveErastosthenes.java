package org.ninit.training.dynamic;

import java.util.ArrayList;
import java.util.List;

public class PrimesSieveErastosthenes {

    public static List<Integer> getPrimesLowerThan(int k) {
        List<Integer> result = new ArrayList<Integer>();
        boolean[] marked = new boolean[k - 2];

        for (int i = 2; i < k; i++) {

            for (int j = i; j < k && j * i < k; j++) {
                if (!marked[(i * j) - 2]) {
                    marked[(i * j) - 2] = true;
                }
            }

        }
        for (int i = 0; i < marked.length; i++) {
            if (!marked[i]) {
                result.add(i + 2);
            }
        }
        return result;
    }

    public static void main(String args[]) {
        System.out.println(PrimesSieveErastosthenes.getPrimesLowerThan(1000));
    }
}
