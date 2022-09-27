package com.javabasics.day3;

import java.util.*;

public class ArrayOddIndexElement {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Size of Array:");
		int size = s.nextInt();
		int[] numbers = new int[size]; 
		System.out.println("Enter "+size+" elements:");
		for(int i=0; i<numbers.length; i++)
		{
			numbers[i]=s.nextInt();
		}
		for(int i=0; i<numbers.length; i++)
		{
			if(i % 2 == 1)
			System.out.println("Odd Positioned Elements: "+numbers[i]);
		}

	}

}
