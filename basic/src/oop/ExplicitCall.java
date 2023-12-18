package oop;

public class ExplicitCall {

	int pk=0;
	String name;
	String add;
	
	public ExplicitCall() {
		// TODO Auto-generated constructor stub
	}
	
	public ExplicitCall(int pk) {
		
		this.pk=pk;
		
		
	}
	
	public ExplicitCall(int pk ,String name,String add) {
		this(pk);
		this.name=name;
		this.add=add;
		
	}
	
	public static void main(String[] args) {
		
		ExplicitCall ex =new ExplicitCall(1,"monti","indore");
		
		System.out.println(ex.pk+" "+ex.name+" "+ex.add);
		
	}
	
}
