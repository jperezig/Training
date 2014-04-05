package org.ninit.training.test;

import java.util.HashSet;
import java.util.Set;

public class SortTestUtils {

	public static boolean checkSorted(int[] input, int[] output) {
		// check size
		if (input.length != output.length) {
			return false;
		}
		// check same elements
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < input.length; i++) {
			set.add(input[i]);
		}
		for (int i = 0; i < output.length; i++) {
			set.remove(input[i]);
		}
		if (set.size() != 0) {
			return false;
		}
		// check sorted
		for (int i = 0; i < output.length - 1; i++) {
			if (output[i] > output[i + 1]) {
				return false;
			}
		}
		return true;
	}

}
