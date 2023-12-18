package Javabasic;

public class Secondlargestnum {

	    public static void main(String[] args) {
//			int ar[]= {22,25,75,89,54,67,99};
//			int a,b;
//			a=b=0;
//			for (int i = 0; i < ar.length; i++) {
//				if(a<ar[i]) {
//					b=a;
//					a=ar[i];
//					
//			}
//				//if(b<ar[i] && ar[i]<a) {
//				//	b=ar[i];
//				//}
//				
//			}
//			System.out.println("largestnum ="+a);
//			System.out.println("second largest ="+b);
	    	int ar[]= {1,33,65,78,43,55};
	    	int a,b;
	    	a=b=0;
	    	for (int i = 0; i < ar.length; i++) {
				if(a<ar[i]) {
					b=a;
					a=ar[i];
				}
				
			}
	    	System.out.println(b);
		}
}
