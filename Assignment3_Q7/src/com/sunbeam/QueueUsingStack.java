package com.sunbeam;

public class QueueUsingStack {

	 private int[] stack1;
	    private int[] stack2;
	    private int top1;
	    private int top2;
	    
	    public QueueUsingStack(int capacity) {
	        stack1 = new int[capacity];
	        stack2 = new int[capacity];
	        top1 = -1;
	        top2 = -1;
	    }
	    
	    // Enqueue operation
	    public void enqueue(int item) {
	        if (top1 == stack1.length - 1) {
	            System.out.println("Queue is full. Cannot enqueue.");
	        } else {
	            stack1[++top1] = item;
	        }
	    }
	    
	    // Dequeue operation
	    public int dequeue() {
	        if (top1 == -1 && top2 == -1) {
	            System.out.println("Queue is empty. Cannot dequeue.");
	            return -1; // Return a sentinel value to indicate an error
	        }
	        
	        if (top2 == -1) {
	            // Transfer elements from stack1 to stack2
	            while (top1 >= 0) {
	                stack2[++top2] = stack1[top1--];
	            }
	        }
	        
	        return stack2[top2--];
	    }
	    
	    // Peek operation
	    public int peek() {
	        if (top1 == -1 && top2 == -1) {
	            System.out.println("Queue is empty. Cannot peek.");
	            return -1; // Return a sentinel value to indicate an error
	        }
	        
	        if (top2 == -1) {
	            // Transfer elements from stack1 to stack2
	            while (top1 >= 0) {
	                stack2[++top2] = stack1[top1--];
	            }
	        }
	        
	        return stack2[top2];
	    }
	    
	    // Check if the queue is empty
	    public boolean isEmpty() {
	        return top1 == -1 && top2 == -1;
	    }
	    
	    public static void main(String[] args) {
	        QueueUsingStack queue = new QueueUsingStack(5);
	        queue.enqueue(1);
	        queue.enqueue(2);
	        queue.enqueue(3);
	        
	        System.out.println("Dequeued: " + queue.dequeue()); // Output: Dequeued: 1
	        System.out.println("Peek: " + queue.peek()); // Output: Peek: 2
	        System.out.println("Is Queue empty? " + queue.isEmpty()); // Output: Is Queue empty? false
	    }
	}

	
		




