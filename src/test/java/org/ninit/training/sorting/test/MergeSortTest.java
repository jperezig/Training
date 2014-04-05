package org.ninit.training.sorting.test;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;
import org.ninit.training.sorting.MergeSort;
import org.ninit.training.test.SortTestUtils;
import org.ninit.training.utils.Utils;

public class MergeSortTest {

	@Test
	public void test() {
		int[] input = Utils.getRandom(10000);
		int[] output = Arrays.copyOf(input, input.length);
		MergeSort ms = new MergeSort();
		ms.sort(output);

		assertTrue(SortTestUtils.checkSorted(input, output));

	}

}
