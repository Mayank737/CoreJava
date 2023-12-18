package basic;

public class Stringmethods {


	public static void main(String[] args) {

		String s = "Dinanath";
		String s1 = "Vijay Dinanath chauhan";
		String s2 = new String("Vijay Dinanath chauhan");
		String sa = s1;
		s.toUpperCase();
		String sb = s.toUpperCase();
		//System.out.println(s1.replaceAll("D", "A"));
		System.out.println(s1.substring(15));
	
//		System.out.println(s1.equals(s2));
	System.out.println(s.indexOf("n"));
//
//		System.out.println(s2.toUpperCase());
//
//		System.out.println(s1 == s2);
//		System.out.println(sa);
//		System.out.println(s1.substring(6));
	System.out.println(s1.substring(5, 12));
//		System.out.println(s1.subSequence(3, 10));
//	System.out.println(s1.matches(s2));
//		System.out.println(s1.contentEquals(s2));
//		System.out.println("----------------------------------");
//		System.out.println(s1.charAt(8));
//		System.out.println(s1.indexOf("n"));
//		System.out.println(s1.lastIndexOf("a", 12));
//		System.out.println(s1.contains(s2));
//		System.out.println(s2.compareTo(s1));
//		System.out.println(s2.compareToIgnoreCase(s1));
//		System.out.println(s.trim());
//		System.out.println(s.join(s1, "jay"));
//		System.out.println(s.length());
//		System.out.println(s.isEmpty());
//		System.out.println("-----------------------------");
//
//		System.out.println(s.codePointAt(0));
//		System.out.println(s.codePointAt(5));
//		System.out.println(s.codePointCount(2, 7));
//		System.out.println(s.valueOf(5));
//		System.out.println("To String" + s2.toString());
//		System.out.println(s.toLowerCase());
//		System.out.println("change" + s1.toUpperCase());
//		System.out.println(s.startsWith("D"));
	//	System.out.println(s1.hashCode());
//
//		String ss = String.join("^", "you", "are", "Awesome");
//		System.out.println(ss);
//		System.out.println("-----------------------------");
	//String s3[] = s1.split("D");
//		for (int i = 0; i < s3.length; i++) {
//			System.out.println("Split  " + s3[i]);
//		}

	}
}
