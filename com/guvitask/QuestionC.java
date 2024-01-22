package com.guvitask;
import java.util.ArrayList;
import java.util.List;
public class QuestionC {
	//  Write a program to convert List to Array

	  public static void main(String[] args) {
		        
		        List<String> stringList = new ArrayList<>();
		        stringList.add("Seden cars");
		        stringList.add("Hatchpack cars");
		        stringList.add("Suv cars");
		        stringList.add("Mpv cars");

		        int size = stringList.size();
		       
		        String[] stringArray = new String[size];
		        stringList.toArray(stringArray);
		        
		        System.out.println("Elements in the array");

		        for (String element : stringArray) {
		            System.out.println(element);
		        }
		    }

}
