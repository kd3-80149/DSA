package com.sunbeam;

import java.util.Scanner;

public class BinaryDesc {
	public static int BinaryDescending(int arr[], int size, int key) {
		int left = 0, right = size - 1, mid;

		while (left <= right) {

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

		int arr[] = { 99, 88, 77, 66, 55, 44, 33, 22, 11 };
		int key = 14;
		int index = BinaryDescending(arr, arr.length, key);
		if (index != -1)
			System.out.println("key is present in array");
		else
			System.out.println("key is not present in array");

	}
}
