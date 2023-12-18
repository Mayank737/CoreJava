package Streamapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Sortnumbet {

	  public static void main(String[] args) {
		List<Integer>list=Arrays.asList(0,1,64,57,34,98,45,23,2,19,44);
	
		List<Integer> list2=list.stream().sorted().collect(Collectors.toList());
	    System.out.println(list2);
	    
	    //decending orderr
	    List<Integer> list3=list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
	    System.out.println(list3);
	    
	  }
}
