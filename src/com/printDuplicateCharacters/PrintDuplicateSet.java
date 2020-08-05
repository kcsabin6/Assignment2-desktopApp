package com.printDuplicateCharacters;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PrintDuplicateSet {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String ");
		String s1=scan.nextLine();
		
		
		char[] chr=s1.toCharArray();
		Set<Character> rev1Character=new HashSet<>();
		rev1Character=findDuplicates(chr);
		for(Character c:rev1Character) {
			System.out.println(c);
		}
		
	}
		
		
		private static Set<Character> findDuplicates(char[] chr) {
		
		Set<Character> Character=new HashSet<>();
		Set<Character> revCharacter=new HashSet<>();
		
		for(int i=0; i<chr.length;i++) {
			if(!Character.add(chr[i])) {
				revCharacter.add(chr[i]);
			}
			else {Character.add(chr[i]);}
		}
		return revCharacter;
		
		
		
	}

	
		
		
	}
	


