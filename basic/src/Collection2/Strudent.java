package Collection2;

public class Strudent {
 
	    int id;
	    String firstname;
	    String lastname;
	    
	    public Strudent(int id,String fn,
	    String ln
	    ) {
			// TODO Auto-generated constructor stub
	    	this.id=id;
	    	this.firstname = fn;
	    	this.lastname = ln;
	    	
	    	
		}
	    public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		
		@Override
		public String toString() {
			return "Strudent [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + "]";
		}
		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		
	    
}
