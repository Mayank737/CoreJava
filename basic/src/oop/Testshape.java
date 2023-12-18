package oop;

public class Testshape {

	   public static Shape geShape(int i) {
		if (i==1) {
			return new Rectangle(5, 5);
		}
		if (i==2) {
			return new Circle(5);
		}
		return null;
	}
	   
	      public static void main(String[] args) {
			Shape s = new Shape();
			s.SetColor("black");
			s.setBorderWidth(10);
			
			System.out.println(s.getBorderWidth());
			System.out.println(s.getColor());
			for (int i = 1; i <=3; i++) {
				System.out.println(geShape(i).area());
				System.out.println(geShape(1).area());
				System.out.println(geShape(2).area());
			}
		}
}
