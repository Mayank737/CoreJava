package oop;

public class TestDeep {
 
	    public static void main(String[] args) throws CloneNotSupportedException {
	    	Account a1 = new Account(10);

			Account a2 = (Account) a1.clone();

			System.out.println(a1.balance);

			System.out.println(a2.balance);

			
		}
}
