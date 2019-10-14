package com.dxc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class compareArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		List<String> list_Strings = new ArrayList<String>();
		List<String> list_Strings1 = new ArrayList<String>();
		System.out.println("Number of elements in the list");
		int size=s.nextInt();

		System.out.println("Enter Elements in the Array1");
		for(int i=0;i<size;i++)
		{
			String name = s.next();
			list_Strings.add(i,name);
		}
		System.out.println("Number of elements in the list");
		int size1=s.nextInt();

		System.out.println("Enter Elements in the Array2");
		for(int i=0;i<size1;i++)
		{
			String name = s.next();
			list_Strings1.add(i,name);
		}
		boolean isEqual = list_Strings.equals(list_Strings1);      
        System.out.println("If true, the lists are identical. If not the lists are not identical. So by comparison the lists are:"+isEqual);

	}

}
