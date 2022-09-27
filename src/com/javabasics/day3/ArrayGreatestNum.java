package com.javabasics.day3;

import java.util.*;

public class ArrayGreatestNum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size: ");
		int size = s.nextInt();
		int arr[] = new int[size];
		int max = arr[0];
		System.out.println("Enter "+size+" Elements: ");
		for(int i=0; i < arr.length; i++)
		{
			arr[i] = s.nextInt();
		}
		for(int i=0; i < arr.length; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		System.out.println("greater: "+max);

	}

}
