package Exeption;

public class Finalhandling {
  
	  public static void main(String[] args) {
//		
//		  try {
//			double div = 15/0;
//			System.out.println(div);
//		} catch (ArithmeticException e) {
//			// TODO: handle exception
//			//System.out.println("0 se nahi hoga");
//			//System.exit(0);
//		}
//		  finally {
//			System.out.println("chalega ");
//		}
		  try {
			double div = 15/0;
			System.out.println(div);
			//System.exit(0);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("not by 0");
			System.exit(0);;
		}
		  finally {
			System.out.println("its run");
		}
	}
}
