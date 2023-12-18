package Exeption;

import java.io.IOException;

import javax.management.RuntimeMBeanException;

public class MultipleCatchhandale {
 
	   public static void main(String[] args)  {
		String s = null;
		   String name = "monti";
		   
		   try {
		
			System.out.println(s.length());
			System.out.println(name.charAt(7));
		
		} 
		   catch (NullPointerException  e) {
			// TODO: handle exception
			   System.out.println("bjnjfh");
		}
	}
}
