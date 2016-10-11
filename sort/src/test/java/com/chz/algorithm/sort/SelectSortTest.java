package com.chz.algorithm.sort;

import static org.junit.Assert.*;

import org.junit.Test;

public class SelectSortTest extends SortTest {

	@Test
	public void testSort() {
		sort();
	}

	@Override
	public Sort create() {
		SelectSort selectSort = new SelectSort();
		return selectSort;
	}

}
