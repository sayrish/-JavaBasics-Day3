package com.javabasics.day3;

public class ArraySmallestElement {

	public static void main(String[] args) {
		int[] arr = new int[]{10,21,312,8742,2,-92,-2};
		int min = arr[0];
		System.out.println("Array Elements are: ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
	
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] < min)
				min=arr[i];
		}
		System.out.println("\nSmallest Element: "+ min);

		
	}

}
