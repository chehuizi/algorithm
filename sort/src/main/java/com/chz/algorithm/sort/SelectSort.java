package com.chz.algorithm.sort;

public class SelectSort extends Sort {

	@Override
	public int[] operate(int[] initialArray) {
		int index = 0;
		while (index < (initialArray.length-1)) {
			for (int i=index+1; i<initialArray.length; i++) {
				if (initialArray[i] < initialArray[index]) {
					swap(initialArray, index, i);
				}
			}
			System.out.println("第" + (index+1) + "次选择结果：" + output(initialArray));
			index++;
		}
		return initialArray;
	}

}
