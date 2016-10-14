package com.chz.algorithm.sort;

public class RadixSort extends Sort {

	@Override
	public int[] operate(int[] initialArray) {
		int[][] buckets = new int[10][0];
		int start = 10;
		do {
			for (int i=0; i<initialArray.length; i++) {
				int a = (initialArray[i]%start)/(start/10);
				buckets[a] = new int[buckets[a].length+1];
				buckets[a][buckets[a].length-1] = initialArray[i];
			}
			int index = 0;
			for (int j=0; j<10; j++) {
				for (int k=0; k<buckets[j].length; k++) {
					initialArray[index] = buckets[j][k];
					index++;
				}
			}
			for (int m=0; m<10; m++) {
				buckets[m] = new int[0];
			}
			start = start * 10;
		} while (start < 100000);
		
		return initialArray;
	}

}
