package com.chz.algorithm.sort;

import static org.junit.Assert.*;

import org.junit.Test;

public class BubbleSortTest {

	@Test
	public void testSort() {
		BubbleSort bubbleSort = new BubbleSort();
		for (int i=0; i<TestData.data.length; i++) {
			System.out.println("test use case -> " + (i+1) + " begin");
			bubbleSort.sort(TestData.data[i]);
			System.out.println("test use case -> " + (i+1) + " end\n");
		}
		
	}
}
