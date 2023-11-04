package com.sunbeam;

public class Queue {

	 private int arr[];
	 private final int SIZE;
	 private int front;
	 private int rear;
	 public Queue(int size)
	 {
		 SIZE=size;
		 arr=new int[SIZE];
		 front=-1;
		 rear=-1;
		 
	 }
	 public void enqueue(int data)
	 {
		 rear=(rear+1)%SIZE;
		  arr[rear]=data;
		  
		 
	 }
	 public int dequeue()
	 
	 {
		
		front=(front+1)%SIZE;
		if(front==rear)
			front=rear=-1;
		return SIZE;
	 }
	public boolean isFull()
	{
	return(front==rear && rear!=-1)||(front==-1 && rear==SIZE);
			
	}
	public boolean isEmpty()
	{
		return front==rear&&rear==-1;
	}
}
    

	
