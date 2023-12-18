package Collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Student implements Comparable<Student> {

	   int id;
	   String name;
	   String add;
	   
	   public Student(int id,String name,String add) {
		// TODO Auto-generated constructor stub
		   this.id=id;
		   this.name=name;
		   this.add=add;
	}
	@Override
	public int compareTo(Student st) {
		if(id==st.id)
		return 0;
		else if(id>st.id)
		return  1;
		else
			return -1;
	}
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
