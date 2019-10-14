package com.dxc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class retrieveElement {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		List<String> list_Strings = new ArrayList<String>();
		 list_Strings.add("Red");
		  list_Strings.add("Green");
		  list_Strings.add("Orange");
		  list_Strings.add("White");
		  list_Strings.add("Black");
		
		  System.out.println("Enter element to be searched");
		  String name=s.next();
		  if(list_Strings.contains(name)){
			  System.out.println("The element exists at:");
			  System.out.println(list_Strings.indexOf(name)+" Position");
		  }
		  else
		  {
			  System.out.println("Element doesnot exist");
		  }
		  
		

	}

}
