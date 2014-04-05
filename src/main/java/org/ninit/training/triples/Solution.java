package org.ninit.training.triples;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {
	public static void main(String args[]) {
		int[] arr;
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		arr = new int[n];

		Set<Integer> previouslySeen = new HashSet<Integer>();
		Set<Integer> count = new HashSet<Integer>();
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		scn.close();
		int triplets = 0;

		for (int i = 0; i < n; i++) {
			if (!previouslySeen.contains(arr[i])) {
				previouslySeen.add(arr[i]);
				count = new HashSet<Integer>();
				for (int j = i + 1; j < n; j++) {
					if (arr[j] > arr[i]) {
						count.add(arr[j]);
					}
				}
				System.out.println(arr[i]+"-->"+count);
				triplets = triplets + ((count.size()*(count.size()-1))/2);
			}
		}

		// Write the code to compute the number of triplets as required
		System.out.println(triplets);
	}
}
