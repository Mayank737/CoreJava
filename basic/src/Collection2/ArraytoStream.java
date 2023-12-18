package Collection2;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArraytoStream {
  
	  public static void main(String[] args) {
		
		  int[] let = {1,2,3,4,4,5,5,6,7,7,8};
		  
		  IntStream stream = Arrays.stream(let);
		  
		  int[]s= stream.distinct().sorted().limit(4).toArray();
		  for (int i : s) {
			System.out.println(i);
		}
	}
}
