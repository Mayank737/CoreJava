package Collection2;

import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

public class FailSafee {
  
	    public static void main(String[] args) {
			
	    	ArrayBlockingQueue<Integer>list=new ArrayBlockingQueue<>(6);
	    	list.add(1);
	    	list.add(2);
	    	list.add(3);
	    	
	    	Iterator it = list.iterator();
	    	
	    	list.add(4);
	    	list.add(5);
	    	
	    	while (it.hasNext()) {
				System.out.println(it.next());
				
			}
		}
}
