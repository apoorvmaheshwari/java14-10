import java.util.*;
public class greatestAndleast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		 TreeMap < Integer, String > tree_map1 = new TreeMap < Integer, String > ();
		  // Put elements to the map 
		  tree_map1.put(10, "Red");
		  tree_map1.put(20, "Green");
		  tree_map1.put(30, "Black");
		  tree_map1.put(40, "White");
		  
		  System.out.println("Enter value to search");
		  int fla= s.nextInt();
		  

		  System.out.println("Orginal TreeMap content: " + tree_map1);
		  System.out.println("Checking the entry for : "+fla);
		  System.out.println("Value is: " + tree_map1.floorEntry(fla));
		  System.out.println("Reverse TreeMap content: " + tree_map1.descendingMap());
		  System.out.println("Enter value below which elements to search");
		  int flam= s.nextInt();
		  System.out.println("Value less than given keyMap " + tree_map1.headMap(flam));
		  int f1=0,f2=0;
		  System.out.println("Enter value between which elements to search");
		  f1= s.nextInt();
		  f2= s.nextInt();
		  System.out.println("Value less than given keyMap " + tree_map1.subMap(f1,f2));
		  
		  
		  
		  
		  

		  
	}

}
