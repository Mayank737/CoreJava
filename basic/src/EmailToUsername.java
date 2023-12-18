import java.util.Scanner;

public class EmailToUsername {

	 
	  public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);
		  String email = sc.next();
		  
		  String[] username = email.split("@");
		  String name = username[0];
		  System.out.println(name);
	}
}
