package com.chz.algorithm.sort;

public class MergeSort extends Sort {

	@Override
	public int[] operate(int[] initialArray) {
		if (initialArray.length == 1) {
			return initialArray;
		} else {
			int[] a = copy(initialArray, 0, initialArray.length/2-1);
			int[] b = copy(initialArray, initialArray.length/2, initialArray.length-1);
			a = operate(a);
			b = operate(b);
			int[] result = merge(a, b);
			return result;
		}
	}

	private int[] merge(int[] a, int[] b) {
		int[] c = new int[a.length+b.length];
		int cIndex = 0;
		int aIndex = 0;
		int bIndex = 0;
		while (cIndex < c.length) {
			if (a[aIndex] <= b[bIndex]) {
				c[cIndex] = a[aIndex];
				aIndex++;
			} else {
				c[cIndex] = b[bIndex];
				bIndex++;
			}
			cIndex++;
			if (aIndex >= a.length || bIndex >= b.length) {
				break;
			}
		}
		if (aIndex >= a.length) {
			for (int i=bIndex; i<b.length; i++) {
				c[cIndex] = b[bIndex];
				bIndex++;
				cIndex++;
			}
		}
		if (bIndex >= b.length) {
			for (int i=aIndex; i<a.length; i++) {
				c[cIndex] = a[aIndex];
				aIndex++;
				cIndex++;
			}
		}
		return c;
	}
}
