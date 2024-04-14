package com.dsa.avltree;

public class AVLTreeFundamentalImplementation {

	private TreeNode root;

	public AVLTreeFundamentalImplementation() {
		this.root = null;
	}

	public void insert(int value) {
		root = insertValue(root, value);
	}

	private TreeNode insertValue(TreeNode root, int value) {
		if (root == null) {
			root = new TreeNode(value);
			return root;
		}

		if (value < root.value) {
			root.left = insertValue(root.left, value);
		} else if (value > root.value) {
			root.right = insertValue(root.right, value);
		}

		root.height = Math.max(height(root.left), height(root.right)) + 1;

		int balanceFactor = balanaceFactor(root);

		// Left - Left case
		if (balanceFactor < -1 && value > root.right.value) {
			return leftRotate(root);
		}

		// Right - Right case
		if (balanceFactor > 1 && value < root.left.value) {
			return rightRotate(root);
		}

		// Left - Right case
		if (balanceFactor > 1 && value > root.left.value) {
			root.left = leftRotate(root.left);
			return rightRotate(root);
		}

		// Right - Left case
		if (balanceFactor < -1 && value < root.right.value) {
			root.right = rightRotate(root.right);
			return leftRotate(root);
		}

		return root;
	}

	public void delete(int value) {
		root = deleteValue(root, value);
	}

	private TreeNode deleteValue(TreeNode root, int value) {
		if (root == null) {
			return root;
		}
		if (value < root.value) {
			root.left = deleteValue(root.left, value);
		} else if (value > root.value) {
			root.right = deleteValue(root.right, value);
		} else {
			if (root.left == null) {
				return root.right;
			} else if (root.right == null) {
				return root.left;
			} else {
				root.value = minValue(root.right);
				root.right = deleteValue(root.right, root.value);
			}
		}

		root.height = Math.max(height(root.left), height(root.right)) + 1;

		int balanceFactor = balanaceFactor(root);

		// Left - Left case
		if (balanceFactor < -1 && value > root.right.value) {
			return leftRotate(root);
		}

		// Right - Right case
		if (balanceFactor > 1 && value < root.left.value) {
			return rightRotate(root);
		}

		// Left - Right case
		if (balanceFactor > 1 && value > root.left.value) {
			root.left = leftRotate(root.left);
			return rightRotate(root);
		}

		// Right - Left case
		if (balanceFactor < -1 && value < root.right.value) {
			root.right = rightRotate(root.right);
			return leftRotate(root);
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

	private TreeNode rightRotate(TreeNode root) {
		TreeNode node = root.left;
		TreeNode node1 = node.right;

		node.right = root;
		root.left = node1;

		root.height = Math.max(height(root.left), height(root.right)) + 1;
		node.height = Math.max(height(node.left), height(node.right)) + 1;
		return node;
	}

	private TreeNode leftRotate(TreeNode root) {
		TreeNode node = root.right;
		TreeNode node1 = node.left;

		node.left = root;
		root.right = node1;

		root.height = Math.max(height(root.left), height(root.right)) + 1;
		node.height = Math.max(height(node.left), height(node.right)) + 1;
		return node;
	}

	private int balanaceFactor(TreeNode root) {
		if (root == null) {
			return 0;
		}
		return height(root.left) - height(root.right);
	}

	private int height(TreeNode root) {
		if (root == null) {
			return 0;
		}
		return root.height;
	}

	public void inorder() {
		inorderTraversal(root);
	}

	private void inorderTraversal(TreeNode root) {
		if (root != null) {
			inorderTraversal(root.left);
			System.out.print(root.value + " -> ");
			inorderTraversal(root.right);
		}
	}

	public static void main(String[] args) {
		AVLTreeFundamentalImplementation avlTreeFundamentalImplementation = new AVLTreeFundamentalImplementation();
		avlTreeFundamentalImplementation.insert(20);
		avlTreeFundamentalImplementation.insert(25);
		avlTreeFundamentalImplementation.insert(30);
		avlTreeFundamentalImplementation.insert(10);
		avlTreeFundamentalImplementation.insert(5);
		avlTreeFundamentalImplementation.insert(15);
		avlTreeFundamentalImplementation.insert(27);
		avlTreeFundamentalImplementation.insert(19);
		avlTreeFundamentalImplementation.insert(16);
		avlTreeFundamentalImplementation.inorder();
		System.out.println();
		avlTreeFundamentalImplementation.delete(16);
		System.out.println("After deletion : ");
		avlTreeFundamentalImplementation.inorder();
	}

}
