package com.sunbeam;

import java.util.Scanner;

public class StackMain {

	public static void main(String[] args) {
		DescendingStack ds = new DescendingStack(4);
		int choice;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("0. EXIT\n1. PUSH\n2. POP\n3. DISPLAY");
			System.out.println("ENTER YOUR CHOICE: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				if (ds.isFull())
					System.out.println("STACK IS FULL.");
				else
					System.out.println("Enter data :");
				int data = sc.nextInt();
				ds.push(data);
				
				break;
			case 2:
				if(ds.isEmpty())
					System.out.println("Stack is empty ");
				else
					ds.pop();
				
				break;
			case 3:
				//if(ds.isEmpty())
					//System.out.println("Stack is empty ");
				//else
					ds.display();
				
				break;

			}

		} while (choice != 0);

	}

}
