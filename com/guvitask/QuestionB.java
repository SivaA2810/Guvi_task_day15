package com.guvitask;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class QuestionB {
//	3. Write a Java program to create a TreeMap of 
//	employee IDs and names. Then, print out the names of all the employees in alphabetical order.


	public static void main(String[] args) {
		
		
		TreeMap<Integer, String> map = new TreeMap<>();
		
		map.put(1005, "Sivakumar");
		map.put(1003, "Karthick");
		map.put(1002, "balan");
		map.put(1001, "Arunkumar");
		map.put(1004, "Pragadhan");
		
	
		
		Set<Entry<Integer, String>> list = map.entrySet();
		
		for (Entry<Integer, String> entry: list) {
			System.out.println(entry);
		}
		
		
		
		
	
	        }
		
	}



