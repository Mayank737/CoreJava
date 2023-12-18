package Collection2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestStuComrable {
  
	 public static void main(String[] args) {
	 
		 ArrayList<Student> al = new ArrayList<Student>();		  
		 al.add(new Student(5, "Monti","Indore"));
		 al.add(new Student(14, "Mayank", "Khargone"));
		 al.add(new Student(9, "Shivam", "bhopal"));
		 al.add(new Student(7, "Ankit", "Badwani"));
		 
		 
		 Collections.sort(al);
		 for (Student st : al) {
			System.out.println(st.id+" "+st.name+" "+st.add);
		}
	 }
}
