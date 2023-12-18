package Javabasic;

import java.util.ArrayList;
import java.util.List;

public class ForLamda {

	    public static void main(String[] args) {
			List<String>li = new ArrayList<String>();
			
			li.add("bhupendra");
			li.add("monti");
			li.add("sawan");
			li.add("patidar");
			
			li.forEach((name)->System.out.println(name));
		}
}
