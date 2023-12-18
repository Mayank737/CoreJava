package Collection2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapSort {

	  //Map sort using Stream by vslue and print key also
	      public static void main(String[] args) {
			Map<String, Integer>map = new HashMap<>();
			map.put("Monti", 100);
			map.put("Mayank", 25);
			map.put("ram", 75);
			
			Map<String, Integer>sort=new LinkedHashMap<>();
			
			map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEachOrdered(x->sort.put(x.getKey(),x.getValue()));
			System.out.println(sort);
			
		}
}
