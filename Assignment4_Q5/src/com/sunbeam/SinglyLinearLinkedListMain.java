package com.sunbeam;

import java.util.Scanner;

public class SinglyLinearLinkedListMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		InsertBeforeAfterList l1 = new InsertBeforeAfterList();
		l1.addFirst(10);
		l1.addFirst(20);
		l1.addFirst(30);
		l1.addFirst(40);
		l1.addFirst(50);
		l1.addFirst(60);
		do {
			System.out.println("Enter node/position to add before or after = ");
			int pos = sc.nextInt();
			System.out.println("1.Add Before given node\n2.Add After given node");
			System.out.println("Enter choice : ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter value of a node = ");
				int value = sc.nextInt();
				l1.insertBefore(pos, value);
				l1.displayList();
				break;
			case 2:
				System.out.println("Enter value of a node = ");
				int val = sc.nextInt();
				l1.insertAfter(pos, val);
				l1.displayList();
				break;
			}
		} while (choice != 0);

	}
}
