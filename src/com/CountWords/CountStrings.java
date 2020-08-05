package com.CountWords;

import java.util.Scanner;

/*Write a java program to count the number of words in a string?
		*/
		
public class CountStrings {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String for count ");
		String s1=scan.nextLine();
		//System.out.println(s1.length());
		char [] str=s1.toCharArray();
		
		int n=countString(s1);
		System.out.println("Total words are "+n);

	}

	private static int countString(String s1) {
	
		int k = 0;
		for (int i=0;i<s1.length();i++) {
			if(s1.charAt(i)==' ') {k++;}
			//System.out.println(s1);
			//return k;
		}
		return k+1;
	}

}
