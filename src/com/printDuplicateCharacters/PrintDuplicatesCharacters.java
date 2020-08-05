package com.printDuplicateCharacters;

import java.util.Scanner;

/*To print duplicate Characters In A String*/

public class PrintDuplicatesCharacters {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String ");
		String s1=scan.nextLine();
		
		char[] chr=s1.toCharArray();
		
		printDuplicates(chr);
		

	}

	
	
	
	private static void printDuplicates(char[] chr) {
		int k;
		int len=chr.length;
		for (int i=0; i<len-1; i++) {
			k=1;
			for (int j=i+1;j<len-1; j++) {
				if(chr[i]==chr[j] && chr[i] !=' ');
				{
				k++;
				chr[j]='0';
				}
			}
			
			if(chr[i]!='0' && k>1) {
			//for (int l=0; l<len-1; l++) {
				System.out.println(chr[i]);
			}
		}
		
		
	}

}
