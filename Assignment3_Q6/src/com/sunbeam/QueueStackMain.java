package com.sunbeam;

public class QueueStackMain {

	public static void main(String[] args) {
		StackUsingQueue st=new StackUsingQueue(5);
		st.push(4);
		st.push(3);
		st.push(5);
		st.push(1);
		//st.push(6);
		System.out.println("Pop elememt "+st.pop());
		st.push(7);
		System.out.println("pop.element "+st.pop());

	}

}
