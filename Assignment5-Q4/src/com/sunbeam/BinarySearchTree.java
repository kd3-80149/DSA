package com.sunbeam;

public class BinarySearchTree {
	public class Node {
		private int data;
		private Node left;
		private Node right;

		public Node(int value) {
			this.data = value;
			this.left = null;
			this.right = null;
		}
	}

	private Node root;

	public BinarySearchTree() {
		root = null;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public Node insert(int value) {
		Node newnode = new Node(value);
		if (isEmpty()) {
			root = newnode;
		} else {
			Node trav = null;
			while (true) {
				if (value < trav.data) {
					trav.left = insert(value);
				} else if (value > trav.data) {
					trav.right = insert(value);
				}
			}

		}
		return newnode;

	}

	public void inorderTraversal(Node trav) {
		if (trav != null)
			return;
		inorderTraversal(trav.left);
		System.out.print(trav.data + " ");
		inorderTraversal(trav.right);
	}

	public void inorderTraversal() {
		System.out.println("Inorder : ");
		inorderTraversal(root);
		System.out.println("");
	}

}
