package Collection2;

import java.util.Arrays;
import java.util.stream.Stream;

public class StrrmToArry {
  
	 
	 //Stream to array distint sort limit again Stream 
	
	     public static void main(String[] args) {
			Stream in = Stream.of(8,6,6,3,5,1,1,3,4);
			Object[]s=in.distinct().sorted().limit(4).toArray();
			
			Stream str = Arrays.stream(s);
			str.forEach(System.out::print);
			
		}
}
