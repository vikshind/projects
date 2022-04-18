package com.vth.algo.sort;

import java.util.Arrays;
/**
 * HeapSort sorting algorithm
 * 
 * @author vikshind
 *
 */
class HeapSort{
      public void sort(int heapArray[]) {
      int heapLength = heapArray.length;
      // construct max heap
      for (int i = heapLength / 2 - 1; i >= 0; i--) {
        heapify(heapArray, heapLength, i);
      }
      // Heap sort
      for (int i = heapLength - 1; i >= 0; i--) {
        int temp = heapArray[0];
        heapArray[0] = heapArray[i];
        heapArray[i] = temp;
        // Heapify root element
        heapify(heapArray, i, 0);
      }
    }
   
    void heapify(int heapArray[], int n, int i) {
      // find largest value
      int largest = i;
      int left = 2 * i + 1;
      int right = 2 * i + 2;
      if (left < n && heapArray[left] > heapArray[largest])
     largest = left;
      if (right < n && heapArray[right] > heapArray[largest])
        largest = right;
      // recursively heapify and swap if root is not the largest
      if (largest != i) {
        int swap = heapArray[i];
        heapArray[i] = heapArray[largest];
        heapArray[largest] = swap;
 
        heapify(heapArray, n, largest);
      }
    }
    
    public static void main(String args[]) {
        //define input array and print it
        int heapArray[] = {6,2,9,4,10,15,1,13};
        System.out.println("Input Array:" + Arrays.toString(heapArray));
        //call HeapSort method for given array
        HeapSort hs = new HeapSort();
        hs.sort(heapArray);
        //print the sorted array  
        System.out.println("Sorted Array:" + Arrays.toString(heapArray));
    }
}