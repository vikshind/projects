package com.vth.ds.heap;

/**
 * MinHeap implementation using Array
 * 
 * @author vikshind
 *
 */
public class MinHeap {
	private int[] heapArray;
	private int size;
	private int maxsize;

	private static final int FRONT = 1;

	// constructor to initialize the HeapArray
	public MinHeap(int maxsize) {
		this.maxsize = maxsize;
		this.size = 0;
		heapArray = new int[this.maxsize + 1];
		heapArray[0] = Integer.MIN_VALUE;
	}

	// returns parent position for the node
	private int parent(int pos) {
		return pos / 2;
	}

	// returns the position of left child
	private int leftChild(int pos) {
		return (2 * pos);
	}

	// returns the position of right child
	private int rightChild(int pos) {
		return (2 * pos) + 1;
	}

	// checks if the node is a leaf node
	private boolean isLeaf(int pos) {
		if (pos >= (size / 2) && pos <= size) {
			return true;
		}
		return false;
	}

	// swap two nodes of the heap
	private void swap(int fpos, int spos) {
		int tmp;
		tmp = heapArray[fpos];
		heapArray[fpos] = heapArray[spos];
		heapArray[spos] = tmp;
	}

	// heapify the node to maintain heap property
	private void minHeapify(int pos) {

		// check if the node is non-leaf and greater than its child
		if (!isLeaf(pos)) {
			if (heapArray[pos] > heapArray[leftChild(pos)] || heapArray[pos] > heapArray[rightChild(pos)]) {

				// swap with left child and then heapify the left child
				if (heapArray[leftChild(pos)] < heapArray[rightChild(pos)]) {
					swap(pos, leftChild(pos));
					minHeapify(leftChild(pos));
				}

				// Swap with the right child and heapify the right child
				else {
					swap(pos, rightChild(pos));
					minHeapify(rightChild(pos));
				}
			}
		}
	}

	// insert a node into the heap
	public void insert(int element) {
		if (size >= maxsize) {
			return;
		}
		heapArray[++size] = element;
		int current = size;

		while (heapArray[current] < heapArray[parent(current)]) {
			swap(current, parent(current));
			current = parent(current);
		}
	}

	// Function to print the contents of the heap
	public void display() {
		System.out.println("PARENT NODE" + "\t" + "LEFT NODE" + "\t" + "RIGHT NODE");
		for (int i = 1; i <= size / 2; i++) {
			System.out.print(" " + heapArray[i] + "\t\t" + heapArray[2 * i] + "\t\t" + heapArray[2 * i + 1]);
			System.out.println();
		}
	}

	// build min heap
	public void minHeap() {
		for (int pos = (size / 2); pos >= 1; pos--) {
			minHeapify(pos);
		}
	}

	// remove and return the heap elment
	public int remove() {
		int popped = heapArray[FRONT];
		heapArray[FRONT] = heapArray[size--];
		minHeapify(FRONT);
		return popped;
	}
}
