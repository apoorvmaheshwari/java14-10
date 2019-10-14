package com.dxc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class shuffleElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		int flag=0;
		do {
			Collections.shuffle(list_Strings);
			System.out.println(list_Strings);
			System.out.println("Do you want to shuffle again. 1 for yes any other key for no");
			flag=s.nextInt();
		}while(flag==1);
		System.out.println(list_Strings);

	}

}
