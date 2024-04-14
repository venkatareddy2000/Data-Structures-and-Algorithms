package com.dsa.binarytree;

public class PerfectBinaryTreeFundamentalImplementation {

	public int depth(TreeNode root) {
		int depth = 0;
		while (root != null) {
			depth++;
			root = root.left;
		}
		return depth;
	}

	public boolean isPerfectBinaryTree(TreeNode root, int depth, int level) {
		if (root == null)
			return true;

		if (root.left == null && root.right == null)
			return (depth == level + 1);

		if (root.left == null || root.right == null)
			return false;

		return isPerfectBinaryTree(root.left, depth, level + 1) && isPerfectBinaryTree(root.right, depth, level + 1);
	}

	public boolean isPerfectBinaryTree(TreeNode root) {
		int d = depth(root);
		return isPerfectBinaryTree(root, d, 0);
	}

	public static void main(String[] args) {

		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);

		PerfectBinaryTreeFundamentalImplementation perfectBinaryTreeFundamentalImplementation = new PerfectBinaryTreeFundamentalImplementation();
		boolean perfectBinaryTree = perfectBinaryTreeFundamentalImplementation.isPerfectBinaryTree(root);
		if (perfectBinaryTree)
			System.out.println("Perfect binary tree");
		else
			System.out.println("Not a perfect binary tree");
	}

}
