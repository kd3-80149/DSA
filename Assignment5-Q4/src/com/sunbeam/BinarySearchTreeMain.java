package com.sunbeam;

import com.sunbeam.BinarySearchTree.Node;

public class BinarySearchTreeMain {

	public static void main(String[] args) {
		BinarySearchTree bst=new BinarySearchTree();
		Node root = null;
		root= bst.insert( 6);
		 root=bst.insert(7);
		 root=bst.insert(8);
		 root=bst.insert(9);
		 root=bst.insert(10);
		 root=bst.insert(11);
		
		 System.out.println("Inorder Traversal of BST :");
		 bst.inorderTraversal(root);

	}

}
