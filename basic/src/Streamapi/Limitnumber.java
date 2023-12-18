package Streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Limitnumber {

	 public static void main(String[] args) {
			List<Integer>list=Arrays.asList(0,1,64,57,34,98,45,23,2,19,44);
		//limit
	List<Integer>list22	=list.stream().limit(5).collect(Collectors.toList());
			System.out.println(list);
		
			//sum of first 5 num
			int sum	=list.stream().limit(5).reduce((p,q)->p+q).get();
			System.out.println(sum);
			
			//skip first 5 num
			
		List<Integer>l2	=list.stream().skip(5).collect(Collectors.toList());
			System.out.println(l2);
}
}