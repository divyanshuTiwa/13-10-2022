package com.strings.demo.bll;
/*Take a sentence as a user input. 
Break up the sentence into words.
Sort the words based on the length of the word - and print out.
Example: If user inputs the sentence: "Hi, welcome to this mentoring session", the output should be:
to
Hi,
this
welcome
session
mentoring.
*/

import java.util.Scanner;

public class SortSolution004 {



	// Function to Sort the array of string
	// according to lengths. This function
	// implements Insertion Sort.
	static void sort(String []s, int n)
	{
		for (int i=1 ;i<n; i++)
		{
			String temp = s[i];

			// Insert s[j] at its correct position
			int j = i - 1;
			while (j >= 0 && temp.length() < s[j].length())
			{
				s[j+1] = s[j];
				j--;
			}
			s[j+1] = temp;
			
		}
	}

	// Function to print the sorted array of string
		// void printArraystring(string,int);

	static void printArraystring(String str[], int n)
	{
		for (int i=0; i<n; i++)
			System.out.print(str[i]+" ");
	}

	// Driver function
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence : ");
		String sentence = sc.nextLine();
		//Break up the sentence into words and display
		String[] words = sentence.split(" ");
		System.out.print("Break sentence into words : ");
		for(String w:words)
			System.out.print(w+" ");
		String []arr = {"The MadhyaPradesh", "I", "am", "from"};
		int n = arr.length;
		
		// Function to perform sorting
		sort(arr,n);
		// Calling the function to print result
		printArraystring(arr, n);
		sc.close();
		
	}
	}



