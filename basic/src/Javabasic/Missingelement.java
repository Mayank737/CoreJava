package Javabasic;

public class Missingelement {
   
  public static void main(String[]args) {
	  
//	  int a[]= {1,2,3,4,5};
//	  int b[]= {1,3,5};
//	  
//	  for (int i = 0; i < a.length; i++) {
//	   boolean flag = true;
//	   for (int j = 0; j < b.length; j++) {
//		if(a[i]==b[j]) {
//			flag = false;
//		}
//	}
//	   if(flag) {
//		   System.out.println(a[i]);
//	   }
//	}
    
       int a[]= {1,3,4,2,5,6,43,4322,2442,12,42,7,8};
       int b[]= {1,2,4,6,8};
       
       for (int i = 0; i < a.length; i++) {
		boolean flag = true;
		for (int j = 0; j < b.length; j++) {
			if(a[i]==b[j]) {
				flag = false;
			}}
			if(flag) {
				System.out.print(" "+a[i]);
			
		}
	}}}
    
