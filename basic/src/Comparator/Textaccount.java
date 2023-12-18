package Comparator;

public class Textaccount extends Thread {
	public static Account acc = new Account();

	private String name;

	public Textaccount(String n) {
		this.name = n;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			acc.deposit(name, 1000);
		}

	}

	public static void main(String[] args) {
		Textaccount t1 = new Textaccount("ram");
		Textaccount t2 = new Textaccount("shyam");

		t1.start();
		t2.start();
	}

}
