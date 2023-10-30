package com.sunbeam;

public class Stack {
	private int arr[];
	private int top;
	private final int SIZE;

	public Stack(int size) {
		SIZE = size;
		arr = new int[SIZE];
		top = -1;
	}

	public int push(int data) {

		top++;

		return arr[top] = data;
	}

	public int pop() {

		int data = arr[top];

		top--;

		return data;
	}
     public int findMax()
     {
    	 int max=Integer.MIN_VALUE;
    	 for(int i=0;i<=top;i++)
    	 {
    		 if(arr[i]>max) {
    			 max=arr[i];
    		 }
    	 }
		return max;
     }

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == SIZE - 1;
	}

}
