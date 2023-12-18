package OnetoOne;

public class Explicit {
 
	    int pk=0;
	    String name;
	    String add;
	
	    public Explicit() {
			// TODO Auto-generated constructor stub
		}
	    public Explicit(int pk) {
	    	this.pk= pk;
	    }
	    public Explicit(int pk,String name,String add) {
	    	this();
	    	this.name = name;
	    	this.add=add;
	    }
	    
}
