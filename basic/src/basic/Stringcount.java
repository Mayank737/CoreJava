package basic;

public class Stringcount {
public static void main(String[] args) {
	String s = "Moonotii";
	int j=0;
	for (int i = 0; i < s.length(); i++) {
		
		char c=s.charAt(i);
		String k = String.valueOf(c);
		
		if(k.matches("i")) {
			j++;
		}
	}
		System.out.println(j);
	
}
}
