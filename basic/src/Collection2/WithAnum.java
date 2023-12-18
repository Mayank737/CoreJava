package Collection2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WithAnum {

	     public static void main(String[] args) {
	    	 List<String> names = Arrays.asList("Ava", "Alberto", "Sarah", "Bro","Sam", "Smith");
			 names = names.stream().filter(s1 -> s1.startsWith("B")).collect(Collectors.toList());
			  for (String name : names) {
				System.out.println("Names Start with S: " + name);
			  }
		}
}
