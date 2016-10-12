package com.chz.algorithm.sort;

import static org.junit.Assert.*;

import org.junit.Test;

public class QuickSortTest extends SortTest {

	@Test
	public void testSort() {
		sort();
	}

	@Override
	public Sort create() {
		QuickSort quickSort = new QuickSort();
		return quickSort;
	}

}
