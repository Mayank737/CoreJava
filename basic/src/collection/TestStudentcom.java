package collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestStudentcom {

	public static void main(String[] args) {


		List<StudentCom> list =Arrays.asList(new StudentCom(4, "Raja", "Rathore"),
				new StudentCom(3, "Rajesh", "Kumar"), 
				new StudentCom(1, "Neeraj", "Malviya"), 
				new StudentCom(2, "Neeraj", "Jha"));

	Collections.sort(list, new SortByLname());
	
	list.forEach(System.out::println);
	}

}
