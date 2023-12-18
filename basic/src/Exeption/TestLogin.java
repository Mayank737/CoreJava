package Exeption;

import javax.security.auth.login.LoginException;

public class TestLogin {

	 
	  
	   public static void main(String[] args) {
		
		   try {
			 authenticate("Sunrays", "Sunrays");
		} catch (LoginException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	   
	}
	   public static void authenticate(String login,String pass) throws LoginException {
		   boolean flag = true;
		   if (flag) {
		     throw new LoginException();	
		}
		  }
	 
}
