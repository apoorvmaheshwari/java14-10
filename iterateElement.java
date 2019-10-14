package com.dxc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class iterateElement {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		List<String> list_Strings = new ArrayList<String>();
		 list_Strings.add("Red");
		  list_Strings.add("Green");
		  list_Strings.add("Orange");
		  list_Strings.add("White");
		  list_Strings.add("Black");
		  
		  System.out.println("Iterate number");
		  int r=s.nextInt();
		  
		  Iterator p = list_Strings.listIterator(r);
		  while (p.hasNext()) {
			   System.out.println(p.next());
			   }
	}

}
