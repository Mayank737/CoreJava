package collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortEmpComparatortest {

	public static void main(String[] args) {


		List <EmployeeComparator> list = Arrays.asList(new EmployeeComparator(1, "A", 400), 
				new EmployeeComparator(2, "D", 100), 
				new EmployeeComparator(3, "B", 500), 
				new EmployeeComparator(4, "F", 200));

		String s1 = "SortByName";
		
		if(s1.equals("SortBySalary"))
		{
			Collections.sort(list, new SortByNameComparator());
		}
		else
		{
			Collections.sort(list, new SortBySalaryComparator());
		}
		list.forEach(System.out::println);
	}

}
