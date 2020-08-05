package com.Q9;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortString {
	
	public static void main(String[] args) {
		
		 String[] arr = {"prabhat", "saurav", "anushka", "aamir", "prithvi"};
		 
		 System.out.println("Ascending iteration: ");
		 sortAscending(arr);
		 for(String str:arr) {
			 System.out.println(str);
		 }
		 
		 System.out.println("Descending iteration : ");
		 sortDescending(arr);
		 for(String str:arr) {
			 System.out.println(str);
		 }
		 
		 List<String> list= Arrays.asList(arr);
		 System.out.println("Ascending Collections : ");
		 Collections.sort(list);
		 for(String str:list) {
			 System.out.println(str);
		 }
		 
		 System.out.println("Descending Collections : "); 
		 Collections.sort(list,new SortByDescending());
		 for(String str:list) {
			 System.out.println(str);
		 }
	}

	private static void sortAscending(String[] arr) {
		int len=arr.length;
		String temp;
		for (int i=0;i<len-1;i++) {
		for(int j=i+1;j<len;j++) {
			if(arr[i].compareTo(arr[j])>0) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		}
	}
		
		private static void sortDescending(String[] arr) {
			int len=arr.length;
			String temp;
			for (int i=0;i<len-1;i++) {
			for(int j=i+1;j<len;j++) {
				if(arr[i].compareTo(arr[j])<0) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			}
		
		
	}

	
	
	
	
}
