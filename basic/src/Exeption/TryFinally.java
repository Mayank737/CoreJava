package Exeption;

public class TryFinally {
   public static void main(String[] args) {
	 
	   int a = 10;
	   int b = 0;
	   
	   try {
		double d  = a/b;
	} finally {
		// TODO: handle finally clause
		System.out.println("the issue with using only finally with try is that JVM will print complete trace of exception like this :-");
	}
}
}
