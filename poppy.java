
import java.util.*;

public class poppy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		List<String> list_Strings = new LinkedList<String>();
		 list_Strings.add("Red");
		  list_Strings.add("Green");
		  list_Strings.add("Orange");
		  list_Strings.add("White");
		  list_Strings.add("Black");
		  System.out.println(list_Strings);
		  
		  System.out.println("Removed element: "+list_Strings.pop());
		  System.out.println(list_Strings);
	}

}
