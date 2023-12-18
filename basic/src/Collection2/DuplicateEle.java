package Collection2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateEle {
  
	   public static void main(String[] args) {
		List list = Arrays.asList(1,2,3,6,4,5,7,8,8,7,3);
		
		
	List l=	(List) list.stream().filter(x->Collections.frequency(list, x)>1).distinct().collect(Collectors.toList());
		l.forEach(System.out::println);
				}
}
