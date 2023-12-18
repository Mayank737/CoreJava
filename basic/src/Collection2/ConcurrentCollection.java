package Collection2;

import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentCollection extends Thread {
	private static ConcurrentHashMap<String, Integer>hm=new ConcurrentHashMap<>();
	
	public void run() {
		hm.put("nine", 9);
	}
	
	public static void main(String[] args) {
		hm.put("five", 5);
		hm.put("Three", 3);
		hm.put("two", 2);
		hm.put("one", 1);
		
		ConcurrentCollection t1=new ConcurrentCollection();
		t1.start();
		for (Entry<String, Integer> o : hm.entrySet()) {
			System.out.println(o);
		}
	}
	   
}
