package Collection2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class DivideBy7 {

	   public static void main(String[] args) {
		
		   List<Integer>l1 = Arrays.asList(1,13,14,18,21,38,35);
		   List<Integer> s = l1.stream().filter(a->a%7==0).collect(Collectors.toList());
		   
		   Iterator it = s.iterator();
		   
		   while(it.hasNext()) {
			   System.out.println(it.next());
		   }		   }
		
}
