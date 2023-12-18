package Collection2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeWithStream {

	    public static void main(String[] args) {
			
	    
//	    	List<Integer>list= Arrays.asList(3,64,74,63,23,43,14);
//	    	list.stream().filter(x->!IntStream.rangeClosed(2, x/2).anyMatch(i->x%i==0)).forEach(y-> System.out.println(y+ " "));

	    	 List<Integer>list= Arrays.asList(1,322,31,34,65,35,23);
	    	 // list.stream().filter(x->!IntStream.rangeClosed(2, x/2).anyMatch(i->x%i==0)).forEach(y->System.out.println(y+" "));
	    	  List<Integer> s = list.stream().filter(a->a%2==0).collect(Collectors.toList());
	    	  Iterator it = s.iterator();
			   
			   while(it.hasNext()) {
				   System.out.println(it.next());
	    	// Iterator<Integer> it = list.iterator();
			   }
	    	 
	    	 }
}
