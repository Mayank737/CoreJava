package Streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.omg.Messaging.SyncScopeHelper;

public class Methods {
  public static void main(String[] args) {
	
	  //filter(predicate)
	  //predictae-> is nothing just boolean value funtion true false detah  
  
	   List<String> names = Arrays.asList("Monti","Lucky","Kapil","Yash","Aaram");
	   
	 List<String> newname= names.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
	   System.out.println(newname);
	   
	  
	   
	   //number with map
	   List<Integer> numbers = Arrays.asList(12,34,5,67,23,45);

	   List<Integer> number1 =numbers.stream().map(i->i*i).collect(Collectors.toList());
	     System.out.println(number1);
	     
	     
	     //sorted
	      numbers.stream().sorted().forEach(System.out::println);
	      
	      //min and max number  k liye
	      
	    Integer int1 = numbers.stream().min((x,y)->x.compareTo(y)).get();
	       System.out.println("minimum num  is = "+int1);
	      
	       Integer int2 = numbers.stream().max((x,y)->x.compareTo(y)).get();
	       System.out.println("maximum num  is = "+int2);
	     
	     
	   
  
  }
}
