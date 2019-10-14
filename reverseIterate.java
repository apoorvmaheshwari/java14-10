package com.dxc;

import java.util.*;

public class reverseIterate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
		  Collections.reverse(list_Strings);
		 
		  while (p.hasNext()) {
			   System.out.println(p.next());
			   }
	

	}

}
