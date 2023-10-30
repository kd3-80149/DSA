//Write a program to implement descending stack. (Initialize top = SIZE)
package com.sunbeam;

public class DescendingStack {

	private int arr[];
	private int top;
	private final int SIZE;

	public DescendingStack(int size) {
		SIZE = size;
		arr = new int[SIZE];
		top = size;
	}

	public void push(int data) {
		if(top>0)
		top--;
		else
		arr[top] = data;
         
	}

	public int pop() {
		int data = arr[top];
		top++;
		
		return data;

	}

	public void display() {
        if (top == SIZE) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements: ");
            for (int i = top; i <SIZE; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

	public boolean isFull() {
		return top == 0;
	}

	public boolean isEmpty() {
		return top == SIZE;
	}
}
