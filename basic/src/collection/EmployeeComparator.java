package collection;

public class EmployeeComparator {
      

	private int id;
	private String name;
	private int salary;
	
	
	public EmployeeComparator(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "EmployeeComparator [id=" + id + ", name=" + name + ", Salary=" + salary + "]";
	}
}
