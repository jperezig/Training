package org.ninit.training.threesum;

import java.util.HashSet;
import java.util.Set;

import org.ninit.training.sorting.QuickSort;
import org.ninit.training.utils.Utils;

public class ThreeSum {

    private int[] input;

    public ThreeSum(int[] input) {
        this.input = input;
    }

    private Set<Integer> getSet(int[] input, int from, int to) {
        Set<Integer> numbers = new HashSet<Integer>();
        for (int i = from; i < to; i++) {
            numbers.add(input[i]);
        }
        return numbers;
    }

    public int sol1() {
        Set<Integer> numbers;
        ;
        int found = 0;
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                numbers = getSet(input, j + 1, input.length - 1);
                int lookingFor = -(input[i] + input[j]);
                if (numbers.contains(lookingFor)) {
                    System.out.println(input[i] + "+" + input[j] + "+"
                            + (lookingFor) + "=0");
                    found++;
                }

            }
        }
        return found;
    }

    public int sol2() {
        int found = 0;
        QuickSort qs = new QuickSort();
        qs.sort(input);
        for (int i = 0; i < input.length - 3; i++) {
            int a = i + 1;
            int l = input.length - 1;
            while (l > a) {
                if (input[i] + input[a] + input[l] == 0) {
                    System.out.println(input[i] + "+" + input[a] + "+"
                            + input[l] + "=0");
                    found++;
                    // break;
                    a++;
                    l = input.length - 1;
                } else if (input[i] + input[a] + input[l] > 0) {
                    l--;
                } else {
                    a++;
                }
            }

        }
        return found;
    }

    public static void main(String args[]) {
        int[] input = Utils.getRandomWithNegatives(10, 10);
        input = new int[] { -4, -2, -1, 1, 0, 2, 4, 6, 9, 9 };
        ThreeSum ts = new ThreeSum(input);
        System.out.println(ts.sol1());
        System.out.println(ts.sol2());

    }

}
