package com.reverseWordsInString;

import java.util.Scanner;

public class ReverseWordInString {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String for reverse words ");
		String s1=scan.nextLine();
		scan.close();
		
		String [] words=s1.split("\\s");
		String rev="";
		
		for(int i=0;i<words.length;i++) {
			if(i==words.length-1) {
				rev=words[i]+rev;
			}
			else {
				rev=" "+words[i]+rev;
			}
		}
		System.out.println("Reverse words : "+rev);

	}

}
