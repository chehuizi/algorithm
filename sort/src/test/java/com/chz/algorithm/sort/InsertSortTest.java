package com.chz.algorithm.sort;

import static org.junit.Assert.*;

import org.junit.Test;

public class InsertSortTest extends SortTest {

	@Test
	public void testSort() {
		sort();
	}

	@Override
	public Sort create() {
		InsertSort selectSort = new InsertSort();
		return selectSort;
	}

}
