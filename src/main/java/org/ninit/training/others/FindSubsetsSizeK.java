package org.ninit.training.others;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindSubsetsSizeK {

    private static void getSubsets(int[] array, int l, int position,
            Set<Integer> tempSet, List<Set<Integer>> solution) {

        if (tempSet.size() == l) {
            solution.add(new HashSet<>(tempSet));
            return;
        }
        if (position == array.length)
            return;
        int x = array[position];
        tempSet.add(x);
        getSubsets(array, l, position + 1, tempSet, solution);
        tempSet.remove(x);
        getSubsets(array, l, position + 1, tempSet, solution);
    }

    public static void main(String args[]) {
        List<Set<Integer>> result = new ArrayList<Set<Integer>>();
        getSubsets(new int[] { 1, 2, 3, 4, 5 }, 2, 0, new HashSet<Integer>(),
                result);

        for (int i = 0; i < result.size(); i++) {
            for (int v : result.get(i)) {
                System.out.print(v + " ");
            }
            System.out.println();
        }
    }
}
