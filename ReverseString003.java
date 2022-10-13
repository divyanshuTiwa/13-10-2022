package com.strings.demo.bll;

import java.util.Scanner;

public class ReverseString003 {

	public static void main(String[] args) {
		
				//Scanner object for input string.
				Scanner scanner = new Scanner(System.in);
				
				//User message.
				System.out.println("Enter a string : ");
				String str = scanner.nextLine();
				System.out.println("Origional string : "+ str);
				
				//Calling reverseString method
				reverseString(str);
				scanner.close();
			}
			public static void reverseString(String str) {
				for(int i=str.length()-1; i>=0; i--) {
					if(i==str.length()-1)
						System.out.print("Reverse string : ");
					System.out.print(str.charAt(i));
				}
			}


	}


