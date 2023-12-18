package Exeption;

public class TestChek {

	  public static void main(String[] args) {
		dad();
	}
	  public static void dad() {
		  try {
			mom();
		} catch (Cheked e) {
			System.out.println(e.getMessage());
		}
	  }
	  public static void mom() throws Cheked{
		  son();
	  }
	  public static void son() throws Cheked{
		  Cheked e = new Cheked();
		  throw e                                                                                                                                                                                                                                                                          ;
	  }
}
