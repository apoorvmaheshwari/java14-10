package com.dxc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class elementAtfirst {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		List<String> list_Strings = new ArrayList<String>();
		System.out.println("Number of elements in the list");
		int size=s.nextInt();

		System.out.println("Enter Elements in the String");
		for(int i=0;i<size;i++)
		{
			String name = s.next();
			list_Strings.add(i,name);
		}
		  // Print the list
		  System.out.println(list_Strings);
		  System.out.println("Enter Name at 0 position");
		  String nam= s.next();
		  list_Strings.add(0,nam);
		  System.out.println("Edited List:\n");
		  System.out.println(list_Strings);
		  

	}

}
