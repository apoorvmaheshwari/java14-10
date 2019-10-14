import java.util.*;
public class searchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub TreeMap<String,String> tree_map1=new TreeMap<String,String>();      
		 TreeMap<Integer,String> tree_map1=new TreeMap<Integer,String>();      
		 Scanner s = new Scanner(System.in);
		  // Put elements to the map 
		  tree_map1.put(1, "Apoorv");
		  tree_map1.put(2, "Saswat");
		  tree_map1.put(3, "Shubham");
		  tree_map1.put(4, "Mehul");
		  tree_map1.put(5, "Mrutyunjay");
		  System.out.println(tree_map1);
		  System.out.println("Want to search by value or by key. Press 0 for value and 1 for key");
		  int flag=s.nextInt();
		  if(flag==0) {
		  System.out.println("Enter element to be searched");
		  String st= s.next();
		        if(tree_map1.containsValue(st)){
		            System.out.println("The Tree Map contains:"+st);
		        } else {
		            System.out.println("The Tree Map does not contain:"+st);
		        }
		  }
		  else if(flag==1){
			  System.out.println("Enter key to be searched");
			  int str= s.nextInt();
			        if(tree_map1.containsKey(str)){
			            System.out.println("The Tree Map contains:"+str);
			        } else {
			            System.out.println("The Tree Map does not contain:"+str);
			        }
			  
		  }
		        

	}

}
