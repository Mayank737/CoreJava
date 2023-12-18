package Javabasic;

import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Rays implements Serializable {
	
	  private String name;
	public  Rays (String name){
		this.name();  
	  }
	  
	  private void name() {
		}

	public static void main(String[] args) {
		try {
			Rays r = new Rays("java");
	    FileOutputStream io = new FileOutputStream("file.txt");
			ObjectOutputStream os = new ObjectOutputStream(io);
			os.writeObject(r);
			io.close();
			os.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	   
}

    //New keyword
//class GFG {
//	
//    String name = "Rays";
// 
//    
//    public static void main(String[] args)
//    {
//      
//        GFG obj = new GFG();
// 
//        // Print and display the object
//        System.out.println(obj.name);
//    }
//}


         //New instance
//class GFG {
//	 
//    
//    String name = "MontiBaaba";
// 
//    
//    public static void main(String[] args)
//    {
//      
//        try {
// 
//            Class cls = Class.forName("GFG");
// 
//            
//            GFG obj = (GFG)cls.newInstance();
// 
//           
//            System.out.println(obj.name);
//        }
    


  //Clone()

//class GFG implements Cloneable {
// 
//   
//    @Override
//    protected Object clone()
//        throws CloneNotSupportedException
//    {
//       
//        return super.clone();
//    }
// 
//    
//    String name = "Rays";
// 
//    
//    public static void main(String[] args)
//    {
//        GFG obj1 = new GFG();
// 
//        
//        try {
// 
//           
//            GFG obj2 = (GFG)obj1.clone();
// 
//            System.out.println(obj2.name);
//        }
// 
//       
//        catch (CloneNotSupportedException e) {
// 
//       
//            e.printStackTrace();
//        }
//    }
//}


