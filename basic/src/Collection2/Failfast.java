package Collection2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Failfast {
  public static void main(String[] args) {
	
	   List list = new ArrayList();
	   list.add(1);
	   list.add(2);
	   list.add(3);
	   
	   Iterator it = list.iterator();
	   list.add(4);
	   list.add(5);
	   
	   while (it.hasNext()) {
		System.out.println(it.next());
		
	}
	   
}
}
