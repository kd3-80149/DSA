//Q2. Write a bubble sort function to sort array and returns no of comparisions.
package com.sunbeam;

import java.util.Arrays;

public class BubbleSort {
	public static void improvedBubbleSort(int arr[], int N) {
		int count=0;
		int passes=0;
		int flag;
		for(int i=1;i<N;i++)
		{
			passes++;
			flag=0;
			for(int j=0;j<N-i;j++)
			{
				count++;
				if(arr[j]>arr[j+1])
				{
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				flag=1;
				
				}
			}
			if(flag==0)
				break;
		}
		System.out.println("comparison : "+count);
		System.out.println("Number of passes : "+passes);
	}

	public static void main(String[] args) {
		int arr[]= {33, 22, 66, 55, 44, 11};
		System.out.println("Before sorting array :"+Arrays.toString(arr));
		improvedBubbleSort(arr, arr.length);
		System.out.println("Before sorting array :"+Arrays.toString(arr));
	}

}
