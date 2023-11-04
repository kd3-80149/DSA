package com.sunbeam;

public class StackUsingQueue {
	private Queue queue1;
	private Queue queue2;

	public StackUsingQueue(int size) {
		queue1 = new Queue(size);
		queue2 = new Queue(size);
	}

	public void push(int data) {
		queue2.enqueue(data);
		while (!queue1.isEmpty()) {
			queue2.enqueue(queue1.dequeue());
		}
		Queue temp = queue1;
		queue1 = queue2;
		queue2 = temp;
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty. Cannot pop.");
			return -1;
		} else {
			return queue1.dequeue();
		}
	}

	public boolean isEmpty() {
		return queue1.isEmpty();

	}

}
