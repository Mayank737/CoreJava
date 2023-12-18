package Streamapi;

import java.util.stream.Stream;

public class StreamObject {

	 public static void main(String[] args) {
		
		 //1-blank
		 Stream<Object> empty =Stream.empty();
		 ////2- array se
		 String names[]= {"Monti","Kapil","Yash","Lalit"};
		 
		 Stream<String> stream1=Stream.of(names);
		 stream1.forEach(e->{
			 System.out.println(e);
		 });
		 
		  
	 }
	   
}
