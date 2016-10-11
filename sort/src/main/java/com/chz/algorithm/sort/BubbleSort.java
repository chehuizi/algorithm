package com.chz.algorithm.sort;

public class BubbleSort extends Sort {

	@Override
	public int[] sort(int[] initialArray) {
		if (initialArray == null) {
			System.out.println("input param is null...");
			return null;
		} else {
			if (initialArray.length == 0) {
				System.out.println("the size of the input array is zero...");
				return initialArray;
			} else if (initialArray.length == 1) {
				System.out.println("排序结果：" + output(initialArray));
				return initialArray;
			} else {
				System.out.println("初始数组：" + output(initialArray));
				int index = initialArray.length - 1;
				while (index >= 1) {
					for (int i=0; i<index; i++) {
						if (initialArray[i] > initialArray[i+1]) {
							swap(initialArray, i, i+1);
						}
					}
					System.out.println("第" + (initialArray.length-index) + "次冒泡结果：" + output(initialArray));
					index--;
					
				}
				System.out.println("排序结果：" + output(initialArray));
				return initialArray;
			}
		}
	}

}
