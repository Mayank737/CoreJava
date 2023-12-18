package Javabasic;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class TypeCasting {

	    public static void main(String[] args) {
			// small to big datatype convertion
	    	//Implicigt type-casting
//	    	
//	    	   int i = 5;
//	    	   System.out.println(i);
//	    	   double d = i;
//	    	   System.out.println(d);
	    	int i = 5;
	    	System.out.println(i);
	    	double d = i;
	    	System.out.println(d);
	    	   
	    	   //big to smaall datatype convertion 
	    	   //explicit type-casting
	    	   
             double d1 = 5;
             System.out.println(d1);
         int li = (int)d1;
         System.out.println(li);
	    }
}
