package Exeption;

public class ParentChildEx {
   
	  public static void main(String[] args) {
		String name = "vijay";
		
		try {
			System.out.println(name.length());
			System.out.println(name.charAt(7));
		} catch (RuntimeException e) {
			// TODO: handle exception
			System.out.println("Present handel Exeption :"+e.getMessage());
		}
	}
}
