package Lambda;

public class Main {

	  public static void main(String[] args) {
//		
//		  Sumint sumint =(int a,int b)->{
//			   return a+b;
//		  };
//		  
		   Sumint sumint=(a,b)-> a+b;
		  System.out.println(sumint.sum(30, 50));
		  System.out.println(sumint.sum(3434, 5656));
	
		  Lengthinter len=str ->str.length();
		  System.out.println("Length of String =  "+len.getLenght("Monti gupta"));
	  }
	  
}
