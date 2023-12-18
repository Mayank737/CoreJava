package Streamapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Secondlowest {

	 public static void main(String[] args) {
			List<Integer>list=Arrays.asList(0,4,5,3,2,9,7,8,1,6);
		
			//Second higest num
			int list2=list.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).findFirst().get();
System.out.println(list2);
	 
int li3 = list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
System.out.println(li3);

   //Second lowest

int li4 = list.stream().sorted().distinct().skip(1).findFirst().get();
System.out.println(li4);

  int list4= list.stream().sorted(Collections.reverseOrder()).distinct().skip(2).findFirst().get();
System.out.println(list4);
  
    int list1= list.stream().sorted().distinct().skip(1).findFirst().get();
    System.out.println(list1);

 	 }
	
}