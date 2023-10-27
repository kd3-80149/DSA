package com.sunbeam;

import java.util.Scanner;

public class LinearQueueMain {

	public static void main(String[] args) {
		Queue q = new Queue(5);
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("0.EXIT\n1.PUSH\n2.POP\n3.PEEK\n");
			System.out.println("Enter choice :");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				if (q.isFull())
					System.out.println("Queue is full ");
				else {
					System.out.println("Enter data :");
					int data = sc.nextInt();
					q.push(data);
					break;
				}

			case 2:
				if (q.isEmpty())
					System.out.println("Queue is empty ");
				else
					q.pop();
				break;
			case 3:
				if (q.isEmpty())
					System.out.println("queue is empty");
				else
					System.out.println("Peeked data : " + q.peek());
				break;

			}

		} while (choice != 0);

	}

}
