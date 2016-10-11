package com.chz.algorithm.sort;

public abstract class Sort {
	public abstract int[] sort(int[] initialArray);
	
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
}
