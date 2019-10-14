import java.util.*;
public class copyTreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TreeMap<Integer,String> tree_map1=new TreeMap<Integer,String>();      
		  
		  // Put elements to the map 
		  tree_map1.put(1, "Apoorv");
		  tree_map1.put(2, "Saswat");
		  tree_map1.put(3, "Shubham");
		  tree_map1.put(4, "Mehul");
		  tree_map1.put(5, "Mrutyunjay");
		   System.out.println("Tree Map 1: "+tree_map1);
		   TreeMap<Integer,String> tree_map2 = new TreeMap<Integer,String>();
		   tree_map2.put(6, "Orange");
		   tree_map2.put(7, "Pink");
		   System.out.println("Tree Map 2: "+tree_map2);
		   tree_map1.putAll(tree_map2);
		   System.out.println("After coping map2 to map1: "+tree_map1);   
		 }  

	}


