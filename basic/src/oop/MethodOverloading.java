package oop;

public class MethodOverloading {
//  
//	   public void show(int num1) {
//		   System.out.println("Number1 is"+" = "+num1);
//	   }
//	   public void show(int num1,int num2) {
//		   System.out.println("Number1 is"+" = "+num1+", Number2 is"+" = "+"num 2");
//	   }
//	   public static void main(String[] args) {
//		MethodOverloading mo = new MethodOverloading();
//		mo.show(5);
//		mo.show(56, 12);
//	}
	
	public void show(int num) {
		System.out.println("number1 is = "+num);
	}
	public void show(int num1,int num2) {
		System.out.println("number1 is ="+num1+" number2 is = "+num2);
	}
	
	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading();
		mo.show(5);
		mo.show(46, 56);
	}
	
}
