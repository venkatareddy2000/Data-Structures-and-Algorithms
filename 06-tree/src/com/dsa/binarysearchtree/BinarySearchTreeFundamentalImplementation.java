package com.dsa.binarysearchtree;

public class BinarySearchTreeFundamentalImplementation {

	public TreeNode root;

	public BinarySearchTreeFundamentalImplementation() {
		this.root = null;
	}

	public void insert(int value) {
		root = insertValue(root, value);
	}

	public TreeNode insertValue(TreeNode root, int value) {
		if (root == null) {
			root = new TreeNode(value);
			return root;
		}
		if (value < root.value)
			root.left = insertValue(root.left, value);
		else if (value > root.value)
			root.right = insertValue(root.right, value);
		return root;
	}

	public void delete(int value) {
		root = deleteValue(root, value);
	}

	public TreeNode deleteValue(TreeNode root, int value) {
		if (root == null) {
			return root;
		}
		if (value < root.value) {
			root.left = deleteValue(root.left, value);
		} else if (value > root.value) {
			root.right = deleteValue(root.right, value);
		} else {
			if (root.left == null)
				return root.right;
			else if (root.right == null)
				return root.left;

			root.value = minValue(root.right);
			root.right = deleteValue(root.right, root.value);
		}
		return root;
	}

	private int minValue(TreeNode root) {
		int minValue = root.value;
		while (root.left != null) {
			minValue = root.left.value;
			root = root.left;
		}
		return minValue;
	}

	public boolean search(int value) {
		return searchValue(root, value);
	}

	public boolean searchValue(TreeNode root, int value) {
		if (root == null)
			return false;
		if (root.value == value)
			return true;
		if (value < root.value)
			return searchValue(root.left, value);
		else
			return searchValue(root.right, value);
	}

	public void inorder() {
		inorderTraversal(root);
	}

	public void inorderTraversal(TreeNode root) {
		if (root != null) {
			inorderTraversal(root.left);
			System.out.print(root.value + " -> ");
			inorderTraversal(root.right);
		}
	}

	public static void main(String[] args) {
		BinarySearchTreeFundamentalImplementation binarySearchTreeFundamentalImplementation = new BinarySearchTreeFundamentalImplementation();

		binarySearchTreeFundamentalImplementation.insert(8);
		binarySearchTreeFundamentalImplementation.insert(3);
		binarySearchTreeFundamentalImplementation.insert(10);
		binarySearchTreeFundamentalImplementation.insert(14);
		binarySearchTreeFundamentalImplementation.insert(1);
		binarySearchTreeFundamentalImplementation.insert(6);
		binarySearchTreeFundamentalImplementation.insert(4);
		binarySearchTreeFundamentalImplementation.insert(7);
		binarySearchTreeFundamentalImplementation.inorder();
		System.out.println();
		boolean search = binarySearchTreeFundamentalImplementation.search(3);
		System.out.println("Is value found in the tree ? : " + search);
		binarySearchTreeFundamentalImplementation.delete(3);
		System.out.println("After Deletion : ");
		binarySearchTreeFundamentalImplementation.inorder();
		System.out.println();
		boolean search1 = binarySearchTreeFundamentalImplementation.search(3);
		System.out.println("Is value found in the tree ? : " + search1);

	}

}
