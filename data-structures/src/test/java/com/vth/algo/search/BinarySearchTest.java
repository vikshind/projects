package com.vth.algo.search;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BinarySearchTest {

    @Test(enabled = true, description = "Tests binary search method")
    public void testSearch() {
    	BinarySearch binarySearch = new BinarySearch();
		int arr[] = { 2, 3, 4, 10, 40 };
		int n = arr.length;
		int x = 10;
		int result = binarySearch.search(arr, 0, n - 1, x);
		
		Assert.assertEquals(result, 3);
		
		x = 5;
		result = binarySearch.search(arr, 0, n - 1, x);
		Assert.assertEquals(result, -1);
    }
}
