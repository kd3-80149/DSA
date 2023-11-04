package com.sunbeam;

public class BubbleSortTest {

	public static void main(String[] args) {
		BubbleSortLinearList l1 = new BubbleSortLinearList();
		l1.addNode(10);
		l1.addNode(70);
		l1.addNode(30);
		l1.addNode(90);
		l1.addNode(80);
		l1.addNode(20);
		l1.addNode(40);
		System.out.println("Original list");
		l1.display();
		l1.bubbleSort();

		System.out.println("Sorted list:");
		l1.display();

	}

}
