package com.dsa.binarytree;

public class FullBinaryTreeFundamentalImplementation {

	public boolean isFullBinaryTree(TreeNode root) {
		if (root == null)
			return true;
		if ((root.left) == null && (root.right) == null)
			return true;
		if ((root.left != null) && (root.right != null))
			return (isFullBinaryTree(root.left) && isFullBinaryTree(root.right));
		return false;

	}

	public static void main(String[] args) {

		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);

		FullBinaryTreeFundamentalImplementation fullBinaryTreeFundamentalImplementation = new FullBinaryTreeFundamentalImplementation();
		if (fullBinaryTreeFundamentalImplementation.isFullBinaryTree(root))
			System.out.println("Full Binary Tree");
		else
			System.out.println("Not a Full Binary Tree");
	}

}
