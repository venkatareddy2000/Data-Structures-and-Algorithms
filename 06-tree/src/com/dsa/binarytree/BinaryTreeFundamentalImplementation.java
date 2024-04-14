package com.dsa.binarytree;

public class BinaryTreeFundamentalImplementation {

	public void inorderTraversal(TreeNode root) {
		if (root == null) {
			return;
		}
		inorderTraversal(root.left);
		System.out.print(root.value + " -> ");
		inorderTraversal(root.right);
	}

	private void preorderTraversal(TreeNode root) {
		if (root == null) {
			return;
		}
		System.out.print(root.value + " -> ");
		preorderTraversal(root.left);
		preorderTraversal(root.right);
	}

	private void postorderTraversal(TreeNode root) {
		if (root == null) {
			return;
		}
		postorderTraversal(root.left);
		postorderTraversal(root.right);
		System.out.print(root.value + " -> ");
	}

	public static void main(String[] args) {

		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);

		BinaryTreeFundamentalImplementation binaryTreeFundamentalImplementation = new BinaryTreeFundamentalImplementation();
		System.out.println("Inorder traversal : ");
		binaryTreeFundamentalImplementation.inorderTraversal(root);
		System.out.println();
		System.out.println("Preorder traversal : ");
		binaryTreeFundamentalImplementation.preorderTraversal(root);
		System.out.println();
		System.out.println("Postorder traversal : ");
		binaryTreeFundamentalImplementation.postorderTraversal(root);
	}

}
