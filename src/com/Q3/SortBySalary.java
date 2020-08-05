package com.Q3;

import java.util.Comparator;

public class SortBySalary implements Comparator<Employee>  {

	@Override
	public int compare(Employee ee1, Employee ee2) {
		
		return (ee1.getSalary())-(ee2.getSalary());
	}

}
