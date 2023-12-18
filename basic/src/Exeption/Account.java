package Exeption;

public class Account {
      
	private String number;
	private String type;
	private double balance;
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void withdrwal(double w) {
		balance = balance-w;
		System.out.println(balance);
	}
	public void deposit(double d) {
		balance = balance+d;
		System.out.println(balance);
	}
}
