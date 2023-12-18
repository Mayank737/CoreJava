package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerieral {
 
	  public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		File file = new File("path");
		
    	StudSireal s = new StudSireal(1, "Monti");
  		
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));		
		out.writeObject(s);
       out.close();
		System.out.println("Sussecc");



  //desirealization
    ObjectInputStream os = new ObjectInputStream(new FileInputStream("path"));
    StudSireal s2 =  (StudSireal) os.readObject();
    System.out.println(s2.getName());
    
    System.out.println(s2.getId());
    
	  }}