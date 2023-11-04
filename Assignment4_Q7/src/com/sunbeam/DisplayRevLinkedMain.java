package com.sunbeam;

public class DisplayRevLinkedMain {

	public static void main(String[] args) {
		RevLinkedList li=new RevLinkedList();
		li.addFirst(12);
		li.addLast(23);
		li.addPosition(40,3);
		li.displayList();
		li.DisplayRevList();
	

	}

}
