package basic;

public final class StringImmutablde {
  
	  private final int ID;
	  
	  private final String NAME;
	  
	  public int getID() {
		  return ID;
		  
	  }
	  public String getName() {
		  return NAME;
		  
	  }
	 
	  
	  public StringImmutablde(int i,String s) {
		  
		  ID=i;
		  NAME=s;
	  }
	  public static void main(String[] args) {
		StringImmutablde s = new StringImmutablde(5, "rams");
				System.out.println(s.getID());
				System.out.println(s.getName());
	}
}
