package oop;

public class Customer implements Cloneable {
   
	String name = null;
	BankAccount account = null;

	public Customer(String name) {
		this.name = name;
		account = new BankAccount(10);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Customer c = (Customer) super.clone();
		c.account = (BankAccount) account.clone();
		return c;
	}
}
