package org.ninit.training.sorting.test;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;
import org.ninit.training.sorting.QuickSort;
import org.ninit.training.utils.Utils;

public class QuickSortTest {

	@Test
	public void test() {
		int[] input = Utils.getRandom(10000);
		int[] output = Arrays.copyOf(input, input.length);
		QuickSort qs = new QuickSort();
		qs.sort(output);

		assertTrue(SortTestUtils.checkSorted(input, output));

	}

}
