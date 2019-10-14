package com.dxc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.LinkedList;

public class appendLast {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		List<String> list_Strings = new ArrayList<String>();

		System.out.println("Number of elements in the list");
		int size = s.nextInt();

		System.out.println("Enter Elements in the Array1");
		for (int i = 0; i < size; i++) {
			String name = s.next();
			list_Strings.add(i, name);
		}
		System.out.println("Enter element to append");
		String siz = s.next();
		 
		list_Strings.add(size,siz);
		System.out.println("After append");
		System.out.println(list_Strings);

	}
}
