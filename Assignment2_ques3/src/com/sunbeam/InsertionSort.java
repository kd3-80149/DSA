//3. Write a insertion sort function to sort array and returns no of comparisions.
package com.sunbeam;

import java.util.Arrays;

public class InsertionSort {
	public static void insertionSort(int arr[], int N) {
		int temp,count=0;
		for (int i = 1; i < N; i++) {
			temp = arr[i];
			int j = i - 1;
			
				while(j >= 0 && arr[j] > temp) {
					count++;
					arr[j + 1] = arr[j];
					j--;
				}
				arr[j+1]=temp;
				
			
		}System.out.println("Comparisons :"+count);
		}
		
	



	public static void main(String[] args) {
		int arr[]= {50,40,30,70,90,35};
		System.out.println("Before sorting :"+Arrays.toString(arr));
		insertionSort(arr, arr.length);
		System.out.println("After Sorting :"+Arrays.toString(arr));
		

	}
}