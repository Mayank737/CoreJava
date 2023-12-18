package OnetoOne;

public class Test {
	public static void main(String[] args) {
		Address a = new Address("indore");
		Employe e = new Employe(1, "monti", a);
		System.out.println(e.id + " " + e.name + " " + a.Address);
	}
}
