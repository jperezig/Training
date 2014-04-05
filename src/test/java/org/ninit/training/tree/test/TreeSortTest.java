package org.ninit.training.tree.test;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.ninit.training.test.SortTestUtils;
import org.ninit.training.tree.TreeSort;
import org.ninit.training.utils.Utils;

public class TreeSortTest {

    @Test
    public void test() {
        TreeSort<Integer> tree = new TreeSort<Integer>();
        int[] input = Utils.getRandom(10000);

        for (Integer i : input) {
            tree.insert(i);
        }
        List<Integer> sorted = tree.sort();
        int[] output = new int[sorted.size()];
        int j = 0;
        for (Integer i : sorted) {
            output[j++] = i;
        }
        assertTrue(SortTestUtils.checkSorted(input, output));
    }

}
