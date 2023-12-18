package Streamapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Duplicatenum {

	  public static void main(String[] args) {
		List<Integer>list=Arrays.asList(1,2,33,4,55,33,7,98,55,2,65,78,98);
	
	  
 Set<Integer> list2=list.stream().filter(e->Collections.frequency(list, e)>1).collect(Collectors.toSet());
    
  System.out.println(list2);
  
     //   list.stream().filter(e->Collections.frequency(list, e)>1).collect(Collectors.toSet());
     
	  
	  }
}
