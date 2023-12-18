package oop;

public class BankAccount implements Cloneable{
	double balance = 0;

	public BankAccount(double balance) {
		this.balance = balance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
