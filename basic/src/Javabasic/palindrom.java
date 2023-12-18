package Javabasic;

public class palindrom {
   public static void main(String[] args) {
	
//
//	  int num=432234,rem,temp,rev=0;
//	  temp=num;
//	  while(num>0)
//	  {
//		  rem=num%10;
//		  rev=rev*10+rem;
//		  num=num/10;
//	  }
//	  if(temp==rev)
//		 System.out.println("number is palindrome");
//	  else
//		  System.out.println("not palindrome");
//}}
//
	   
	    int num=33311333,rem,temp,rev=0;
	    temp=num;
	    while(num>0) {
	    	rem=num%10;
	    	rev=rev*10+rem;
	    	num=num/10;
	    	
	    }
	    if(temp==rev)
	    System.out.println("palindrome");
	    else
	    	System.out.println("not palindrome");
	    
	    
   }}