package com.javabasics.day3;

import java.util.*;

public class PrintDuplicateElements {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Array Size: ");
		int size = s.nextInt();
	        int[] arr = new int[size];
		System.out.println("Enter "+size+" Numbers: "); 
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=s.nextInt();
		}
	        System.out.println("Duplicate elements in given array: ");  
	        for(int i = 0; i < arr.length; i++) 
		{  
	            for(int j = i + 1; j < arr.length; j++) {  
	                if(arr[i] == arr[j])  
	                    System.out.println(arr[j]);
			
	        }  
			
	        }

	}

}
