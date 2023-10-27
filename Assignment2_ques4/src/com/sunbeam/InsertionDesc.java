//Q4. Modify the insertion sort algorithm to sort the array in descending order
package com.sunbeam;

import java.util.Arrays;

public class InsertionDesc {
	public static void insertionDesc(int arr[], int N) {
		int temp;
		for (int i = 1; i < N; i++) {
			temp = arr[i];
			int j = i - 1;
			while (j >= 0 && temp > arr[j]) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;

		}
	}

	public static void main(String[] args) {
		int arr[] = { 50, 60, 20, 80, 10, 30 };
		System.out.println("Before sorting :" + Arrays.toString(arr));
		insertionDesc(arr, arr.length);
		System.out.println("After sorting :" + Arrays.toString(arr));

	}

}
