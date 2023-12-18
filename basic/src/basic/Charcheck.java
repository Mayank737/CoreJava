package basic;

public class Charcheck {

	public static void main(String[] args) {

		String s = "my name is monti gupta from rays";

		String [] t = s.split(" ");
		String l = t[t.length-4];
		
		System.out.println(l);
	}
}
