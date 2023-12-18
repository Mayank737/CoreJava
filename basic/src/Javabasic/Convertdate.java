package Javabasic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Convertdate {
  
	  public static void main(String[] args) throws ParseException {
//		Date d = new Date();
//		SimpleDateFormat sf = new SimpleDateFormat("dd/mm/yyyy");
//		
//		String s = sf.format(d);
//		System.out.println(s);
//		String ds ="5/12/2022";
//		Date sd =sf.parse(ds);
//		System.out.println(sd);
		  
		Date d = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("dd/mm/yyyy");
   
       String s = sf.format(d)
;
       System.out.println(s);
       String sd = "05/12/2022";
       Date ds = sf.parse(sd);
       System.out.println(ds);
    		   
	  }
}
