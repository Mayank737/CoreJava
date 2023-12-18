package Exeption;

public class TestAge {
  
	  public static void validate(int age) throws InvalidAgeExep {
		  if(age<18) {
			throw new InvalidAgeExep("Age is not valid");
		}
		  else {
			System.out.println("welcome to vote");
		}
	  }
	  public static void main(String[] args) {
		try {
			validate(19);
		} catch (InvalidAgeExep e) {
			// TODO: handle exception
			//System.out.println("cauth the Exception");
			System.out.println("Exception accured "+e);
			
		}
	
	}
}
