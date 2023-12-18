package Javabasic;

public class Armstrong {
  public static void main(String[] args) {
  
//	     int n=153;
//	     int r;
//	     int s=0;
//	     int temp;
//	     
//	     temp=n;
//	     while(n>0) {
//	    	 r=n%10;
//	    	 s=(r*r*r)+s;
//	    	 n=n/10;
//	     }
//	     if(temp==s) {
//	    	 System.out.println("armstrong");
//	     }else
//	    	 System.out.println("not armstorng");
	
	 
	 int n = 152;
	 int r;
	 int s = 0;
	  int temp;
	  
	  temp = n;
	   while(n>0) {
		   
		   r = n%10;
		   s=(r*r*r)+s;
		   n=n/10;
		   
	   }
	   if (temp==s) {
		System.out.println("num is armstrong = ");
	} else {
          System.out.println("num is not Armstrong =");
	}
	  
	 
}}