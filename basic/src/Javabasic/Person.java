package Javabasic;

public class Person {

	// Factory method 
	static Person person = null;
	public static Person getinstance() {
		person = new Person();
		return person;
	}
	public void show() {
		System.out.println("295");
	}
	public static void main(String[] args) {
		Person p = getinstance();
		p.show();
	}
}