//Q1. Write a selection sort function to sort array and returns no of comparisions.
package com.sunbeam;

import java.util.Arrays;

public class InsertionSort {
	public static void insertionSort(int arr[], int N) {
		int count = 0;
		for (int i = 0; i <= N - 1; i++) {
			for (int j = i + 1; j <= N - 1; j++) {
				count++;
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("comparisons :" + count);
	}

	public static void main(String[] args) {
		int arr[] = { 50, 40, 60, 67, 20, 30, 55, 35 };
		System.out.println("Array before sort : " + Arrays.toString(arr));
		insertionSort(arr, arr.length);
		System.out.println("Array after sort : " + Arrays.toString(arr));

	}

}
