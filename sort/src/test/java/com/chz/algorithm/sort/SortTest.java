package com.chz.algorithm.sort;

public abstract class SortTest {
	
	public void sort() {
		Sort sort = create();
		int[][] data = TestData.init(10, 10, 100);
		for (int i=0; i<data.length; i++) {
			System.out.println("[Test Use Case " + (i+1) + "] begin.................");
			int[] result = sort.sort(data[i]);
			boolean checkResult = check(result);
			System.out.println("[Test Use Case " + (i+1) + "] end. Check result is " + checkResult + "\n");
		}
	}
	
	public abstract Sort create();
	
	public boolean check(int[] array) {
		boolean result = true;
		if (array != null && array.length > 1) {
			for (int i=0; i<array.length-1; i++) {
				if (array[i] > array[i+1]) {
					result = false;
				}
			}
		}
		return result;
	}
}
