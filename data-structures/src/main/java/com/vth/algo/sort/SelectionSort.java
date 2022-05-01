package com.vth.algo.sort;

/**
 * Java program for implementation of Selection Sort
 * 
 * @author vikshind
 *
 */
public class SelectionSort {
	void sort(int arr[]) {
		// One by one move boundary of unsorted subarray
		for (int i = 0; i < arr.length - 1; i++) {
			// Find the minimum element in unsorted array
			int min_idx = i;
			for (int j = i + 1; j < arr.length; j++)
				if (arr[j] < arr[min_idx])
					min_idx = j;

			// Swap the found minimum element with the first
			// element
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
	}

	// Prints the array
	void printArray(int arr[]) {
		for (int i = 0; i < arr.length; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	// Driver code to test above
	public static void main(String args[]) {
		SelectionSort selectionSort = new SelectionSort();
		int arr[] = { 64, 25, 12, 22, 11 };
		System.out.println("UnSorted array");
		selectionSort.printArray(arr);
		// Perform sort
		selectionSort.sort(arr);
		System.out.println("Sorted array");
		selectionSort.printArray(arr);
	}
}
