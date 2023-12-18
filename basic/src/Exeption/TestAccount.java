package Exeption;

public class TestAccount {

	   public static void main(String[] args) throws Insufficiantfund {
		
		   Account a = new Account();
		   a.setType("Current");
		   a.setNumber("9111099170008656");
		   a.setBalance(59000);

	    
		    System.out.println(a.getType());
		    System.out.println(a.getNumber());
		    System.out.println(a.getBalance());
		    a.setBalance(10000);
		    a.withdrwal(9500);
		    auth(a.getBalance());
		    System.out.println(a.getBalance());
	   }

	private static void auth(double balance)throws Insufficiantfund {
		// TODO Auto-generated method stub
		if (balance<=500) {
			Insufficiantfund f = new Insufficiantfund();
			throw f;
		}
	}
}
