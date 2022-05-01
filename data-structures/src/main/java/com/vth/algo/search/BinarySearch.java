package com.vth.algo.search;

/**
 * Java implementation of recursive Binary Search
 * 
 * @author vikshind
 *
 */
class BinarySearch {
	/**
	 * Returns index of an element if it is present in arr[left..right], else return
	 * -1
	 * 
	 * @param array
	 * @param left
	 * @param right
	 * @param element
	 * @return
	 */
	public int search(int array[], int left, int right, int element) {
		if (right >= left) {
			int mid = left + (right - left) / 2;

			// If the element is present at the
			// middle itself
			if (array[mid] == element)
				return mid;

			// If element is smaller than mid, then
			// it can only be present in left subarray
			if (array[mid] > element)
				return search(array, left, mid - 1, element);

			// Else the element can only be present
			// in right subarray
			return search(array, mid + 1, right, element);
		}

		// We reach here when element is not present
		// in array
		return -1;
	}

	// Driver method to test above
	public static void main(String args[]) {
		BinarySearch binarySearch = new BinarySearch();
		

		int arr[] = {-1,0,3,5,9,12};
		int n = arr.length;
		int x = 2;
		int result = binarySearch.search(arr, 0, n - 1, x);
		if (result == -1)
			log("Element not present");
		else
			log("Element found at index " + result);
	}

	private static void log(String str) {
		System.out.println(str);
	}
}
