package Array;

public class ArrayDemo {

	  public static void main(String[] args) {
		
		 // DECLARATION 
		 //   int[] a;
		   
		//Creation
	//	  isme size provide karna h 
		//  a = new int[3];
		  
		  //Initialization
		  //declaration and creation in single line 
		//  int[] a = new int[3];
		  
		  int[] a = new int[2];
		
	//int[] a = new int[-3];  //Exception 
		  
   //int[] a = {10,20,30}; // declaration+creation+initialization 		  
		  
		  a[0]=10;
		  a[1]=20;
		  //a[4]=40;  // Exeption arrayindexoutofbound
		 for (int i : a) {
			 System.out.print(i+" ");  
		}
		  
	}
}
