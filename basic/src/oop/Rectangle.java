package oop;

public class Rectangle extends Shape{

	     private int length;
	     private int breadth;
	     
	     public Rectangle(int l,int b) {
			// TODO Auto-generated constructor stub
	    	 this.length=l;
	    	 this.breadth=b;
	    	 
	    	 
		}

		public int getLength() {
			return length;
		}

		public int getBreadth() {
			return breadth;
		}
		@Override
		public double area() {
			return (length*breadth);
		}
}
