package Collection2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestStuddenCom {

	  public static void main(String[] args) {
		
		  Strudent s1 = new Strudent(1, "monti","gupta");
		  Strudent s2 = new Strudent(1, "Mayank","sharma");
		  Strudent s3 = new Strudent(1, "monti","mandloi");
		  Strudent s4 = new Strudent(1, "monti","mahajan");
		  Strudent s5 = new Strudent(1, "tushar","verma");
		  
		  List<Strudent>list = new ArrayList<Strudent>();
		  
		  list.add(s1);
		  list.add(s2);
		  list.add(s3);
		  list.add(s4);
		  list.add(s5);
		  
		  Collections.sort(list,new TestStudent());
		  Iterator<Strudent> it = list.iterator();
		  
		  while(it.hasNext()) {
			  Strudent s = it.next();
			  System.out.println(s.getId()+" "+s.getFirstname()+" "+s.getLastname());
		  }
		  
	}
}
