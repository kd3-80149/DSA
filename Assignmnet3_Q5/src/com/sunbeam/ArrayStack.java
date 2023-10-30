package com.sunbeam;

import java.util.Stack;

public class ArrayStack {
	public static void reversedArray(int arr[], int n) {
		Stack st = new Stack();
		for (int i = 0; i <=n; i++) {
			st.push(arr[i]);
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
		System.out.println("Aftr reversing array ");
		for (int i = 0; i <= n; i++) {
			arr[i] = (int) st.pop();

		}
		for (int i = 0; i <= n; i++) {
			System.out.print(arr[i] + " ");

		}

	}

	public static void main(String[] args) {
		int n = 4;

		int[] arr = { 10, 20, 30, 40, 50 };
		
		reversedArray(arr, n);
		
		

	}
}