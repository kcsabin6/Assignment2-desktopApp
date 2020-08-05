package com.circularPrime;

import java.util.Scanner;

public class CircularPrime {

	public static void main(String[] args) {
		
		System.out.println("Enter the number to check Circular Prime ");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		
		if(checkCircular(n)) {System.out.println("True");}
		else {System.out.println("False");}
		
		

	}

	
	private static boolean checkCircular(int n) {
		
		int count=0;
		int temp=n;
		while(temp>0)
		{
			count++;
			temp/=10;
		}
		int num=n;
		while(checkPrime(num)) {
			int rem = num % 10; 
	        int div = num / 10; 
	        num = (int)((Math.pow(10, count - 1)) * rem) + div;
	        if(num==n) return true;
		}
		
		return false;
	}


	private static boolean checkPrime(int n) {
		if (n<=1) return false;
		if(n<=3) return true;
		if(n%2==0 && n%3==0) return false;
		for (int i = 5; i * i <= n; i = i + 6) 
            if (n % i == 0 || n % (i + 2) == 0) 
                return false; 
		return true;
	}

	
	
	
	
}
