package com.reverseWordsInString;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseStringWords {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String for reverse words ");
		String s1=scan.nextLine();
		scan.close();
		
		char[] chr=s1.toCharArray();
		String sarr=reverseWords(chr);
		
		System.out.println(sarr);
		

	}

	
	
	
	private static String reverseWords(char[] chr) {
		
		String rev=" "; 
				
		for(int i=chr.length-1;i>=0;i--) {
			 int k=i;	//last character index is stored in k
			 while(i>=0 && chr[i]!=' ') {	//iterating for last word (until space)
				 i--;
			 }
			int j=i+1;		//index of first letter of last word is found
			while(j<=k) {
				rev=rev+chr[j];		//copy last word to rev
				j++;
			}
			rev=rev+" ";
		}
	
		
		
		return rev;
	}

	
	
	
	
}
