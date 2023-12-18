package Streamapi;

import java.util.Arrays;
import java.util.List;

public class NumberSquareAvg {
   
	 public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12,10,17,15);
		
	double avg	= list.stream().map(e->e*e).filter(e->e>100).mapToInt(e->e).average().getAsDouble();
		 
				System.out.println(avg);
	}
	 
}
