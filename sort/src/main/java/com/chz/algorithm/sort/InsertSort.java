package com.chz.algorithm.sort;

public class InsertSort extends Sort {

	@Override
	public int[] operate(int[] initialArray) {
		for (int i=1; i<initialArray.length; i++) {
			int index = i;
			for (int j=i; j>=0; j--) {
				if (initialArray[j] > initialArray[i]) {
					index--;
				}
			}
			if (i > index) {
				int tmp = initialArray[i];
				for (int k=i; k>index; k--) {
					initialArray[k] = initialArray[k-1];
				}
				initialArray[index] = tmp;
			}
			System.out.println("第" + (i) + "次插入结果：" + output(initialArray));
		}
		return initialArray;
	}

}
