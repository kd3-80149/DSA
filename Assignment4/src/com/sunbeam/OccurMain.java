package com.sunbeam;

public class OccurMain {

	public static int linear_search(int arr[], int key, int n) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == key)
				count++;
			if (count == n)
				return i;

		}

		return -1;

	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 40, 30, 90, 80, 70, 20, 20, 60 };
		int key = 20;
		int n = 2;
		int index = linear_search(arr, key, n);
		if (index != -1)
			System.out.println(+n + "th occurrence of the " + key + " is at index " + index);
		else
			System.out.println(+n + "th occurrence of the " + key + " is not found in array");

	}
}
