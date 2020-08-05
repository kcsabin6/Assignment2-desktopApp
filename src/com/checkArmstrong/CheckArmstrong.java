package com.checkArmstrong;

import java.util.Scanner;

public class CheckArmstrong {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number to check Armstrong ");
		int num=scan.nextInt();
		
		String s1=Integer.toString(num);
		int n=s1.length();
		
		char s[] = new char[4];
		for(int i=0; i<n;i++) {
		s[i]=s1.charAt(i);	
		}
		
		int sum=0;
		for(int i=0; i<n;i++) {
		sum=pow(s[i],n)+sum;
		}
		
		if(sum==num) {
			System.out.println("The given num "+num+" is Armstrong number");
		}
		else {System.out.println("Not Armstrong");}

		
		
		
	}

	private static int pow(char c,int n) {
		int p=Character.getNumericValue(c);
		int pwr=1;
		for(int i=0; i<n;i++) {
			pwr=p*pwr;
			}
		return pwr;
	}

}
