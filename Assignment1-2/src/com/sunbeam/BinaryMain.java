package com.sunbeam;

import java.util.Scanner;

public class BinaryMain {

	public static int Binary_Search(int arr[], int size, int key) {
		// int count=0;
		int left = 0, right = size - 1, mid;
		while (left < right) {
			mid = (left + right) / 2;
			if (key == arr[mid])
				return mid;
			else if (key < arr[mid])
				right = mid - 1;
			else
				left = mid + 1;

		}
		return -1;

	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter key to be search =");
		int key = sc.nextInt();
		int index = Binary_Search(arr, arr.length, key);
		if (index != -1)
			System.out.println("key is found ");
		else
			System.out.println("key is not found ");
		System.out.println("comparison : " + (index != -1 ? index + 1 : arr.length));

	}

}
