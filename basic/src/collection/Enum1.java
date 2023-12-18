package collection;

import java.util.Enumeration;
import java.util.Vector;

public class Enum1 {
    

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add("One");
		v.add("Two");
		v.add("Three");
		v.add("Four");
		
		Enumeration e = v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}}
}
