package com.vth.algo.search;

public class LinearSearch {
	static int search(int arr[], int element) {
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (element == arr[i]) {
				index = i;
				break;
			}
		}
		return index;
	}

	public static void main(String[] args) {

		int arr[] = { 2, 3, 4, 10, 40 };
		int x = 10;

		// Function call
		int result = search(arr, x);
		if (result == -1)
			System.out.print("Element is not present in array");
		else
			System.out.print("Element is present at index " + result);
	}
}
