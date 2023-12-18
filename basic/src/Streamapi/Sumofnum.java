package Streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Sumofnum {
  public static void main(String[] args) {
	
	   List<Integer> li = Arrays.asList(1,2,33,4,87,8,98,67,85,36,45);
	   Optional<Integer> op=li.stream().reduce((a, b)->a+b);
	   System.out.println("sum of num = "+op+" ");
}
}
