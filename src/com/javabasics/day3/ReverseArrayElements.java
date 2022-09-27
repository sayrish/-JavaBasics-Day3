package com.javabasics.day3;

import java.util.*;

public class ReverseArrayElements {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size = s.nextInt();
		int[] numbers = new int[size];
		System.out.println("Enter Array elements: ");
		for(int i=0; i<size; i++)
		{
			numbers[i] = s.nextInt();
		}
		System.out.println("Reversed Array Elements:");
		for(int i=size-1; i>=0; i--)
		{
			System.out.print(numbers[i]+" ");
		}


	}

}
