package collection;

import java.util.Comparator;

public class SortByNameComparator implements Comparator<EmployeeComparator> {

	@Override
	public int compare(EmployeeComparator o1, EmployeeComparator o2) {
		
		return o1.getName().compareTo(o2.getName());
	}

}