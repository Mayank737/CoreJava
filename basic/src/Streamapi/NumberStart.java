package Streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStart {

	   public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,22,332,-23,76,5,98,287,28,45,20,-333,365);
	List<Integer>	list2= list.stream().map(e->String.valueOf(e)).filter(e->e.startsWith("2")||e.startsWith("-2")).map(Integer::valueOf).collect(Collectors.toList());
		 System.out.println(list2);


		 List<Integer>liss = list.stream().map(e->String.valueOf(e)).filter(e->e.startsWith("9")).map(Integer::valueOf).collect(Collectors.toList());
		 System.out.println(liss);
		
	}
}
