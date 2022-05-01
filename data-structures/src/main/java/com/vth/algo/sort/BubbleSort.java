package com.vth.algo.sort;

/**
 * Java program for implementation of Bubble Sort
 * 
 * @author vikshind
 *
 */
class BubbleSort {
	void bubbleSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			boolean swapped = false;
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					// swap arr[j+1] and arr[j]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
			printArray(arr);
			// IF no two elements were
			// swapped by inner loop, then break
			if (swapped == false)
				break;
		}
	}

	/* Prints the array */
	void printArray(int arr[]) {
		for (int i = 0; i < arr.length; ++i) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	// Driver method to test above
	public static void main(String args[]) {
		BubbleSort bubbleSort = new BubbleSort();
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
		System.out.println("Un Sorted array");
		bubbleSort.printArray(arr);
		bubbleSort.bubbleSort(arr);
		System.out.println("Sorted array");
		bubbleSort.printArray(arr);
	}
}
