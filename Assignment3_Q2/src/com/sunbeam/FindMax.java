package com.sunbeam;

import java.util.Scanner;

public class FindMax {

			public static void main(String[] args) {
				Stack st = new Stack(4);
				int choice;

				Scanner sc  = new Scanner(System.in);
				do {
					System.out.println("0. Exit\n1. Push\n2. Pop\n3. Findmax");
					System.out.print("Enter your choice : ");
					choice = sc.nextInt();
					switch(choice)
					{
					case 1:
						if(st.isFull())
							System.out.println("Stack is full");
						else {
							System.out.print("Enter data : ");
							int data = sc.nextInt();
							st.push(data);
						}
						break;
					case 2:
						if(st.isEmpty())
							System.out.println("Stack is empty");
						else
							System.out.println("Poped Data = " + st.pop());
						break;
					case 3:
						if(st.isEmpty())
							System.out.println("Stack is empty");
						else
							System.out.println("Maximum value = " +st.findMax());
						break;
						default :
							System.out.println("You enter wrong choice:");
							break;
					}
				}while(choice != 0);
				
				sc.close();

}
}