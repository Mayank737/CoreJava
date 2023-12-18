package Collection2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ListtoStream {
   
	   public static void main(String[] args) {
		List list = Arrays.asList(1,2,3,4,5);
		
		List<Integer>l1 = (List<Integer>) list.stream().collect(Collectors.toList());
		System.out.println(l1);
	}
}
