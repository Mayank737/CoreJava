package Javabasic;

public class primeornot {
   public static void main(String[] args) {
////	int num=9;
//	   for (int num = 100; num <= 200; num++) {
//		
//	
//	int temp=0;
//	for (int i = 2; i <= num-1; i++) {
//		if(num%i==0) {
//	  temp=temp+1;		
//	}
//	}
//	if(temp==0) {
//		System.out.print(" "+num);
//	}
////	else {
////		System.out.println("not prime = "+num);
////	}
////	
//	
//	   }
//		
	   for (int num = 1; num<=100; num++) {
		int temp=0;
		for (int i = 2; i <=num-1; i++) {
			if (num%i==0) {
				temp= temp+1;
				
			}
		}
		if (temp==0) {
			System.out.print(" "+num);
		}
	}
   }
   
}
