package com.dxc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class reverseArray {

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
		System.out.println("Reversing string");
		Collections.reverse(list_Strings);
		System.out.println(list_Strings);
		

	}

}
