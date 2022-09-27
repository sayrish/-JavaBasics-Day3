package com.javabasics.day3;

import java.util.Scanner;

public class ArrayFrequencyElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size: ");
		
		//size of array
		int size= sc.nextInt();
		
		//Actual Array
		int number[] = new int[size];
		
		//Array will store the frequency(number of times repeated)
		int frequency[] = new int[number.length];
		
		//visit=-1 bcoz initially it will not be pointing to any index or value of array
		int visit = -1;
		
		//Take Inputs array from user
		System.out.println("Repeated numbers are allowed of length: "+size);
		for(int i=0; i<number.length; i++) 
		{
			number[i] = sc.nextInt();
		}
			
		//initial loop
		for(int i=0; i<number.length; i++)
		{
			//initial count will be one when it visits any number in array
			int count=1;
			for(int j=i+1; j<number.length; j++)
			{
				//checking 0th index with 1st index
				if(number[i] == number[j])
				{
					//if true count is increased and stored in freq[]
					count++;
					frequency[j]=visit;
				}
				if(frequency[i] != visit)
				{
					//if frequency visit is not equal to -1 and prevents duplication
					frequency[i] = count;
				}
			}
		}
		System.out.println("Element: "+"\t "+"Frequency:");
		for(int i=0; i<frequency.length; i++)
		{
			if(frequency[i] !=  visit)
			{					//array element     number of times repeated
				System.out.println(number[i]+"  \t\t"+frequency[i]);
			}
		}

	}

}
