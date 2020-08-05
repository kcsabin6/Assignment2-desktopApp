package com.Q5;
/*
Create a HashMap of 4 cricket players with keys as their names and value as their noOfCenturies.
Iterate and print all player's information using at at least two different ways.
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapMain {

	public static void main(String[] args) {
		
		Map<String,Integer> map=new HashMap<>();
		
		map.put("sachin",130);
		map.put("Ponting",125);
		map.put("Lara",101);
		map.put("Kallas",112);
		
		
		Set<Entry<String,Integer>> entries= map.entrySet();	//Entry<> is like a row of objects
		for (Entry<String,Integer> e: entries) {	//entries points to all set of row of objects
			System.out.println(e.getKey()+" "+e.getValue()); // e points to each row/Entry<>
			//System.out.println(e.getValue());
		}
		
		
		Set<Entry<String,Integer>> entry = map.entrySet();
		Iterator<Entry<String,Integer>> it = entry.iterator();
		while(it.hasNext()) {
			Map.Entry<String,Integer> e= it.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}

		
		

	}

}
