package Javabasic;

public class NewInstance {




   String name = "MontiBaaba";

  
  public static void main(String[] args)
  {
       try {

      Class cls = Class.forName("GFG");

       
     NewInstance obj = (NewInstance)cls.newInstance();

      
       System.out.println(obj.name);
   } catch (Exception e) {
	// TODO: handle exception
	   System.out.println(e.getMessage());
}

  }


}
