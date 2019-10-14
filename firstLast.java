package com.dxc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class firstLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		List<String> list_Strings = new ArrayList<String>();
		 list_Strings.add("Red");
		  list_Strings.add("Green");
		  list_Strings.add("Orange");
		  list_Strings.add("White");
		  list_Strings.add("Black");
		  
		  System.out.println("First Element is:"+ list_Strings.get(0));
		  int num= list_Strings.size();
		  
		  System.out.println("Last Element is:"+list_Strings.get(num-1));
		  

	}

}

