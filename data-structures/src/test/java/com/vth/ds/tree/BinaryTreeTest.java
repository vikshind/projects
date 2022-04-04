package com.vth.ds.tree;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BinaryTreeTest {

	BinaryTree bt = null;

	@BeforeMethod
	public void setup() {
		bt = new BinaryTree();
		bt.add(6);
		bt.add(4);
		bt.add(8);
		bt.add(3);
		bt.add(5);
		bt.add(7);
		bt.add(9);
	}

	@Test(enabled = true, description = "Tests binary tree contains node")
	public void testBinaryTreeContainsNode() {
		Assert.assertEquals(false, bt.containsNode(1));
		Assert.assertEquals(true, bt.containsNode(5));
	}

	@Test(enabled = true, description = "Tests binary tree delete node")
	public void testBinaryTreeDeleteNode() {
		Assert.assertTrue(bt.containsNode(9));
		bt.delete(9);
		Assert.assertFalse(bt.containsNode(9));
	}
}
