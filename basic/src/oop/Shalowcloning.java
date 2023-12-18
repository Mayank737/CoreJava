package oop;

public class Shalowcloning implements Cloneable {
  
	 public double balance = 0;
	 
	 public Shalowcloning(double balance) {
		 super();
		 this.balance = balance;
	 }
	    public Object clone() throws CloneNotSupportedException {
	    	return super.clone();
	    }
	      public static void main(String[] args) throws CloneNotSupportedException {
			Shalowcloning s1 = new Shalowcloning(500);
			Shalowcloning s2 = (Shalowcloning) s1.clone();
	    
			 s2.balance = 700;
			 
			 System.out.println("s1 = "+s1.balance);
	         System.out.println("s2 = "+s2.balance);
	      }
}
