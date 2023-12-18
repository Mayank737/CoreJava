package Streamapi;

import java.util.Arrays;
import java.util.List;

public class AvgOfNum {

	  public static void main(String[] args) {
		
		   List<Integer>list =Arrays.asList(1,43,56,7,89,87,34,22);
		   
//		  double avg= list.stream().mapToInt(e->e).average().getAsDouble();
//	   
//		   System.out.println("avg no = "+ avg);
		   
		double avg=  list.stream().mapToInt(e->e).average().getAsDouble();
		  
		   System.out.println(avg);
	  }
	  
}