package collection;

import java.util.Comparator;

public class SortByLname implements Comparator<StudentCom> {

	@Override
	public int compare(StudentCom o1, StudentCom o2) {

	
		if (	o1.getFname().equals(o2.getFname())){
			return o1.getFname().compareTo(o2.getFname());
		}
		else 
			return o1.getFname().compareTo(o2.getFname());			
		
	}
}
