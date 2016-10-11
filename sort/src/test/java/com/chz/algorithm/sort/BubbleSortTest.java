package com.chz.algorithm.sort;

import static org.junit.Assert.*;

import org.junit.Test;

public class BubbleSortTest extends SortTest {

	@Test
	public void testSort() {
		sort();
	}

	@Override
	public Sort create() {
		BubbleSort bubbleSort = new BubbleSort();
		return bubbleSort;
	}
}
