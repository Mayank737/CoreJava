package Exeption;

public class PropogeEx2 {
             
	public static void main(String[] args) {
		try {
			String s = null;
			System.out.println(s.length());
			System.out.println(s.charAt(2));
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("Exception is empty");
			
		}
	}
}
