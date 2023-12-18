package collection;

public class StudentCom {

	int id;
	String fname;
	String lname;
	
	public StudentCom(int id, String fname, String lname){
		this.id = id;
		this.fname = fname;
		this.lname = lname;
	}
	
	public String getFname() {
		return fname;
	}

}
