package Exeption;

public class Uncheked {
   public static void main(String[] args) {
	dad();
}
    public static void dad() {
    	try {
			mom();
		} catch (RuntimeException e) {
			// TODO: handle exception
			System.out.println("caught by dad,raised by son");
		}}
    	public static void mom(){
    		son();
    	}
    	public static void son() {
    		RuntimeException e = new RuntimeException(" i made a mistake");
    		throw e;
    	}
    
}
