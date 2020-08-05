package com.Q4;
/*Create 4 Employee class object and add them to Set,
perform iteration,search and sort(using Comprable) employees on  the basis of their empId .
Using Comparator sort on the basis of salary also. 
Employee  class is having 3 attributes- empId,name and salary.*/

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.Q3.Employee;
import com.Q3.SortBySalary;


public class EmployeeMainSet {
	
		public static void main(String[] args) {
			
			Employee e1=new Employee(101,"sabin",8000);
			Employee e2=new Employee(104,"abin",7000);
			Employee e3=new Employee(102,"bin",5000);
			Employee e4=new Employee(103,"in",6000);
			
			//Set<Employee> set=new TreeSet<>();
			Set<Employee> set=new TreeSet<>(new SortBySalary());
			
			set.add(e1);
			set.add(e2);
			set.add(e3);
			set.add(e4);
		
			System.out.println("set is ");
			System.out.println(set);
			
						
			System.out.println("set using iterator default empId ");
			Iterator<Employee> it = set.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			
		/*	System.out.println("set using iterator salary ");
			Set<Employee> set1=new TreeSet<>(new SortBySalary());
			System.out.println("set using iterator ");
			Iterator<Employee> ite = set1.iterator();
			while(ite.hasNext()) {
				System.out.println(ite.next());
			}*/
			
			
		/*	System.out.println("Enter the name to search");
			Scanner scan= new Scanner(System.in);
			String iname= scan.next();
			
			Iterator<Employee> ite = set.iterator();
			while(ite.hasNext()) {
				if(set.contains(iname)) {System.out.println("Found!!");}
				else System.out.println("NotFound!!");
			}
			if(set.contains(iname)) {System.out.println("Found!!");}
			else System.out.println("NotFound!!");*/
			
			

	}

}
