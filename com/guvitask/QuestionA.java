package com.guvitask;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class QuestionA {
//	2. Write a Java program to create an ArrayList of strings 
//	and then remove all the elements from the ArrayList.
	
public static void main(String[] args) {
	List<String> list = new ArrayList<String>();
	list.add("Emp-Name");
	list.add("Emp-Adress");
	list.add("Emp-Id");
	list.add("Emp-Salary");
	list.add("Emp-Company");
	list.add("Emp-Scheme");
	
	
	System.out.println(list);
	
	list.removeAll(list);
	
	
	System.out.println(list);
	
}	
	

}
