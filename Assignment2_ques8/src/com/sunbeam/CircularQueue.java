package com.sunbeam;

public class CircularQueue {
	private int arr[];
	private int front;
	private int rear;
	private final int SIZE;
	private int counter;

	public CircularQueue(int size) {
		SIZE = size;
		arr = new int[SIZE];
		front = -1;
		rear = -1;
		counter = 0;
	}

	public void push(int data) {
		rear = (rear + 1) % SIZE;
		arr[rear] = data;
		counter++;
		System.out.println("push in the queue ");
	}

	public void pop() {
		front = (front + 1) % SIZE;
		if (front == rear) {
			front = rear = -1;
		}
		counter--;
		System.out.println("pop from queue ");
	}

	public int peek() {
		return arr[(front + 1) % SIZE];
	}

	public boolean isFull() {
		return (front == rear && rear != -1) || (front == -1 && rear == SIZE - 1);
	}

	public boolean isEmpty() {
		return (front == rear && rear == -1);
	}

}
