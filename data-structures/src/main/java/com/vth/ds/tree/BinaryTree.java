package com.vth.ds.tree;

/**
 * BinaryTree data structure
 * 
 * @author vikshind
 *
 */
public class BinaryTree {

	Node root = null;

	public void add(int value) {
		root = addRecursive(root, value);
	}

	public boolean containsNode(int value) {
		return containsNode(root, value);
	}

	public void delete(int value) {
		root = deleteRecursive(root, value);
	}

	private Node addRecursive(Node current, int value) {
		if (current == null) {
			return new Node(value);
		}

		if (value < current.value) {
			current.left = addRecursive(current.left, value);
		} else if (value > current.value) {
			current.right = addRecursive(current.right, value);
		} else {
			// value already exists
			return current;
		}

		return current;
	}

	private boolean containsNode(Node current, int value) {
		if (current == null) {
			return false;
		}

		if (value == current.value) {
			return true;
		}

		return (value < current.value) ? containsNode(current.left, value) : containsNode(current.right, value);
	}

	private Node deleteRecursive(Node current, int value) {
		if (current == null) {
			return null;
		}

		if (value == current.value) {
			// Node to delete found, so the code to delete the node will go here

			// Case 1: no children : this is the simplest case; we just need to replace this
			// node with null in its parent node
			if (current.left == null && current.right == null) {
				return null;
			}

			// Case 2: only 1 child : in the parent node, we replace this node with its only
			// child.
			if (current.right == null) {
				return current.left;
			}

			if (current.left == null) {
				return current.right;
			}

			// Case 3: 2 children : this is the most complex case because it requires a tree
			// reorganization
			int smallestValue = findSmallestValue(current.right);
			current.value = smallestValue;
			current.right = deleteRecursive(current.right, smallestValue);
			return current;
		}
		if (value < current.value) {
			current.left = deleteRecursive(current.left, value);
			return current;
		}
		current.right = deleteRecursive(current.right, value);
		return current;
	}

	private int findSmallestValue(Node root) {
		return root.left == null ? root.value : findSmallestValue(root.left);
	}
}
