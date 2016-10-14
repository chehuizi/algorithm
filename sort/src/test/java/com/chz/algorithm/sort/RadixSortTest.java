package com.chz.algorithm.sort;

import static org.junit.Assert.*;

import org.junit.Test;

public class RadixSortTest extends SortTest {

	@Test
	public void testSort() {
		sort();
	}

	@Override
	public Sort create() {
		RadixSort radixSort = new RadixSort();
		return radixSort;
	}

}
