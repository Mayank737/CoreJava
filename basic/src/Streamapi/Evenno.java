package Streamapi;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Evenno {

	   public static void main(String[] args) {
	  
	    List<Integer> list1  = new ArrayList<>(); 
	    list1.add(23);
	    list1.add(2);
	    list1.add(71);
	    list1.add(44);
	    list1.add(9);
	    list1.add(62);
	    list1.add(36);
	//even no
	 List<Integer> l1 = list1.stream().filter(i->i%2==0).collect(Collectors.toList());
	   System.out.println("Even no. = "+l1);
	   
	  List<Integer>l2= list1.stream().filter(i->i>30).collect(Collectors.toList());
	   System.out.println(l2);
	   
	   //odd no 
	   List<Integer> l3 = list1.stream().filter(i->i%2!=0).collect(Collectors.toList());
	   System.out.println("odd no. = "+l3);
	   
	   List<Integer> li4 = list1.stream().filter(i->i%2==0).collect(Collectors.toList());
	   System.out.println(li4);
	}
	  
}
