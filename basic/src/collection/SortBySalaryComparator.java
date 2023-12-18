package collection;

import java.util.Comparator;

public class SortBySalaryComparator implements Comparator<EmployeeComparator>{


	@Override
	public int compare(EmployeeComparator o1, EmployeeComparator o2) {


		if(o1.getSalary() == o2.getSalary()) {
			return 0;
		}
		else if(o1.getSalary() > o2.getSalary()) {
			return 1;
		}
		else {
			return -1;
		}
	}
}
