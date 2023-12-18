package IO;

import java.io.Serializable;

public class StudSireal implements Serializable{

	private  int id=0;
	 private String name=null;
	  
	  public StudSireal() {
		// TODO Auto-generated constructor stub
	}
	  public StudSireal(int id,String name) {
			// TODO Auto-generated constructor stub
	   this.id = id;
	   this.name=name;
	  }
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	  
}
