package com.chz.algorithm.sort;

public class QuickSort extends Sort {

	@Override
	public int[] operate(int[] initialArray) {
		if (initialArray.length == 1) {
			return initialArray;
		} else {
			int pivot = initialArray[0];
			int index = 1;
			for (int i=index; i<initialArray.length; i++) {
				if (initialArray[i] < pivot) {
					swap(initialArray, index, i);
					index++;
				}
			}
			if (index == 1) {
				int[] a = {pivot};
				int[] b = copy(initialArray, 1, initialArray.length-1);
				b = operate(b);
				int[] result = merge(a, b);
				return result;
			} else if (index == initialArray.length) {
				int[] a = {pivot};
				int[] b = copy(initialArray, 1, initialArray.length-1);
				b = operate(b);
				int[] result = merge(b, a);
				return result;
			} else {
				swap(initialArray, 0, index-1);
				int[] a = copy(initialArray, 0, index-2);
				int[] b = copy(initialArray, index, initialArray.length-1);
				a = operate(a);
				b = operate(b);
				int[] result = merge(merge(a, new int[] {pivot}), b);
				return result;
			}
		}
	}

}
