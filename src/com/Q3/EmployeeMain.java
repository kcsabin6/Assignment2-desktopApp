package com.Q3;

import java.util.ArrayList;
import java.util.Collections;

/*Create 4 Employee class object and add them to ArrayList,
perform iteration,serch and sort(using Comprable) employees on  the basis of their empId .
Using Comparator sort on the basis of salary also. 
Employee  class is having 3 attributes- empId,name and salary.*/



public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee e1=new Employee(101,"sabin",8000);
		Employee e2=new Employee(104,"abin",7000);
		Employee e3=new Employee(102,"bin",5000);
		Employee e4=new Employee(103,"in",6000);
		
		ArrayList<Employee> alist=new ArrayList<>();
		alist.add(e1);
		alist.add(e2);
		alist.add(e3);
		alist.add(e4);
		
		System.out.println("The Employees are ");
		System.out.println(alist);
		
		Collections.sort(alist);
		System.out.println("The Employees sorting by empId default ");
		System.out.println(alist);
		
		Collections.sort(alist,new SortBySalary());
		System.out.println("The Employees sorting by salary ");
		System.out.println(alist);
		
		

	}

}
