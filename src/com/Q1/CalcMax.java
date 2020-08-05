package com.Q1;

import java.util.Scanner;

/*Write a program to input 5 numbers on command line argument and calculate maximum of 
them.*/


public class CalcMax {
	public static void main(String[] args) {
		System.out.println("Please enter the numbers(five no's only)");
		Scanner scan = new Scanner(System.in);
		//int x[] = null ;
		int x[] = new int[5] ;
		
		for (int i=0;i<5;i++) {
		System.out.println("enter "+i+" num");
		 x[i]= scan.nextInt();
		}
		
		int y=findmax(x);
		System.out.println("The max no. from input is "+y);
		
	}

	private static int findmax(int[] x) {
		int a=x[0];
		for (int i=0;i<5;i++) {
			 
			if(a<x[i])
			 a=x[i];
			}
		
		
		return a;
	}

}
