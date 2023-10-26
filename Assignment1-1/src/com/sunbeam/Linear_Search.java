package com.sunbeam;

import java.util.Scanner;

public class Linear_Search {
	public static int Search(int arr[], int size, int key) {
		// int count=0;
		for (int i = 0; i < size; i++) {
			if (arr[i] == key)
				return i;

		}

		return -1;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 10, 23, 45, 67, 78, 34, 50 };
		System.out.println("Enter the value to search = ");
		int key = sc.nextInt();
		int index = Search(arr, arr.length, key);
		if (index != -1) {
			System.out.println("key found at index:" + index);
		} else {
			System.out.println("key not found");
		}
		System.out.println("comparison =" + (index != -1 ? index + 1 : arr.length));

	}

}
