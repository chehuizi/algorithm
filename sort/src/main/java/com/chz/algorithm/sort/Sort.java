package com.chz.algorithm.sort;

public abstract class Sort {
	
	public abstract int[] operate(int[] initialArray);
	
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
				int[] result = operate(initialArray);
				System.out.println("排序结果：" + output(result));
				return result;
			}
		}
		
	}
	
	public void swap(int[] array, int i, int j) {
		int tmp = array[j];
		array[j] = array[i];
		array[i] = tmp;
	}
	
	public String output(int[] array) {
		StringBuffer strBuff = new StringBuffer();
		for (int i=0; i<array.length; i++) {
			strBuff.append(array[i] + " ");
		}
		return strBuff.toString().length() > 0 ? strBuff.toString().substring(0, strBuff.toString().length()-1) : "";
	}
	
	public int[] copy(int[] array, int from, int to) {
		if (from >= 0 && to >= 0 && (to - from) >= 0) {
			int[] result = new int[to-from+1];
			for (int i=0; i<result.length; i++) {
				result[i] = array[from+i];
			}
			return result;
		} else {
			return null;
		}
	}
}
