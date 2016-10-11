package com.chz.algorithm.sort;

public class TestData {
	
	public static int[][] init(int capacity, int size, int ceil) {
		int[][] data = new int[capacity+3][];
		for (int j=0; j<capacity; j++) {
			int[] a = new int[size];
			for (int i=0; i<a.length; i++) {
				int random = (int) (ceil * Math.random());
				a[i] = random;
			}
			data[j] = a;
		}
		data[capacity] = null;
		data[capacity+1] = new int[0];
		data[capacity+2] = new int[] {1};
		return data;
	}
}
