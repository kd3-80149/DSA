package com.sunbeam;

import java.util.Scanner;

public class RankElement {
	public static void rankElement(int arr [],int key)
	{
	int rank=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]<=key) {
		rank++;
	}
	}
	System.out.println("rank : "+rank);
	}
	public static void main(String[] args) {
		int arr[]= {10, 20, 15, 3, 4, 4, 1 };
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter key :");
		int key=sc.nextInt();
		rankElement(arr, key);
		
		

	}

}
