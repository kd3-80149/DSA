package com.sunbeam;

public class NonRepeatElement {
	public static int NonRepeatingNumber(int [] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			boolean isRepeating=false;
			for(int j=0;j<arr.length;j++)
			{
				if(i!=j && arr[i]==arr[j]) {
					isRepeating=true;
			break;
			}
		}
		if(!isRepeating)
			return arr[i];//return  first non repeating
	}
		return -1;
	}

	public static void main(String[] args) {
	int arr[]= { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8};
	int index=NonRepeatingNumber(arr);
	if(index!=-1)
		System.out.println("first non repeating element "+index);
	else
		System.out.println("no any non repating element found in array ");
	}

}
