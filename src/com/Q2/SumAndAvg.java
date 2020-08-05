package com.Q2;

import java.util.Scanner;

/*Write a program to print the sum and average of the even and odd numbers separately 
given on command line argument.*/



public class SumAndAvg {

	public static void main(String[] args) {
		System.out.println("Please enter the numbers(ten no's only)");
		Scanner scan = new Scanner(System.in);
		//int x[] = null ;
		int x[] = new int[10] ;
		//int y[] = new int[5] ;
		
		for (int i=0;i<10;i++) {
		System.out.println("enter "+i+" num");
		 x[i]= scan.nextInt();
		}
		
		int z1=findSumOdd(x);
		System.out.println("The Sum of Odd no's is "+z1);	
		System.out.println("The Average of Odd no's is "+z1/2);
		
			
		
		int z2=findSumEven(x);
		System.out.println("The Sum of Even no's is "+z2);	
		System.out.println("The Average of Even no's is "+z2/2);	
		
	
		

	}


	private static int findSumEven(int[] x) {
		int k=0;
		for(int j=0; j<10;j++) {
			if(x[j]%2==0) {
				k=k+x[j];
			}
		}
		return k;
	}


	

	private static int findSumOdd(int[] x) {
		int k=0;
		for(int j=0; j<10;j++) {
			if(x[j]%2!=0) {
				k=k+x[j];
			}
		}
		return k;
	}

	
	
	
	
}
