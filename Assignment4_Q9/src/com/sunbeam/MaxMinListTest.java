package com.sunbeam;

public class MaxMinListTest {

	public static void main(String[] args) {
		MaxMinListValue m = new MaxMinListValue();
		m.addNode(80);
		m.addNode(70);
		m.addNode(60);
		m.addNode(50);
		m.addNode(40);
		m.addNode(30);
		m.addNode(20);
		m.addNode(10);

		m.display();

		int maxValue = m.findMax();
		System.out.println("Maximum Value: " + maxValue);

		int minValue = m.findMin();
		System.out.println("Minmum Value: " + minValue);
	}

}
