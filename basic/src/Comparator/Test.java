package Comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Test {
   
	 public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(101, "Monti", 24));
		al.add(new Student(106, "Shivam", 22));
		al.add(new Student(104, "Deepaak", 28));
		al.add(new Student(103, "Ankit", 27));
		
		System.out.println("Sorting by name");
		Collections.sort(al,new NameComarator());
		for (Student st : al) {
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
		
		 System.out.println("Sorting by age");
		 
		 Collections.sort(al,new AgeCmparator());
		 for(Student st:al) {
			 System.out.println(st.rollno+" "+st.name+" "+st.age
					 );
		 }
	}
}
