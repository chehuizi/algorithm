package com.chz.algorithm.sort;

public class BubbleSort extends Sort {

	@Override
	public int[] operate(int[] initialArray) {
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
		
		return initialArray;
	}

}
