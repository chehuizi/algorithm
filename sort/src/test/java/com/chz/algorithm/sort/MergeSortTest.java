package com.chz.algorithm.sort;

import static org.junit.Assert.*;

import org.junit.Test;

public class MergeSortTest extends SortTest {

	@Test
	public void testSort() {
		sort();
	}

	@Override
	public Sort create() {
		MergeSort mergeSort = new MergeSort();
		return mergeSort;
	}

}
