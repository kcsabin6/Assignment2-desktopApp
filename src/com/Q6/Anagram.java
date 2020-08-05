package com.Q6;

import java.util.Scanner;

/*Java program to check if two String are anagram of each other.
two String are called anagram, if they contains same characters but on different order e.g. army and mary, 
stop and pots etc.
Anagrams are actually mix-up of characters in String.*/



public class Anagram {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first string ");
		String s1=scan.next();
		
		System.out.println("Enter second string ");
		String s2=scan.next();
		
		int k=0;
		
		for(int i=0; i<s1.length() ;i++) {
			for(int j=0; j<s2.length() ;j++) {
				if(s1.charAt(i)==s2.charAt(j)) {k++;}
			}
		}
		
		if(s1.length()==s2.length() && k==s1.length()) {
			System.out.println("Given strings "+s1+" & "+s2+" are Anagrams of each others");
		}
		else {System.out.println("Given strings "+s1+" & "+s2+" are not Anagrams ");}
		
		
	}

}
