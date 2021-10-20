package org.general.arrays;

import java.util.Arrays;

public class SeriesUp {

	/**
	 * Given n>=0, create an array with the pattern {1, 1, 2, 1, 2, 3, ... 1, 2,
	 * 3 .. n} (spaces added to show the grouping). Note that the length of the
	 * array will be 1 + 2 + 3 ... + n, which is known to sum to exactly n*(n +
	 * 1)/2.
	 */
	public static void main(String[] args) {
		seriesUp(1);
		seriesUp(2);
		seriesUp(3);
		seriesUp(4);
		seriesUp(5);

	}

	public static int[] seriesUp(int n) {

		int[] array = new int[n * (n + 1) / 2];
		int a = 1;
		int b = 0;
		int c = 2;
		for (int i = 0; i < array.length; i++) {
			array[i] = a;
			a++;

			if (i == b) {
				a = 1;
				b = b + c;
				c++;

			}

		}

		System.out.println(Arrays.toString(array));
		return array;
	}
}
