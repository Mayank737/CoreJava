package basic;

public class ReverseSentence {

//	public static void main(String[] args) {
//		String s = "Monti Gupta";
//		String arr[] = s.split(" ");
//
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = arr[i].length() - 1; j >= 0; j--) {
//				System.out.print(arr[i].charAt(j));
//			}
//			System.out.print(" ");
//		}
//
//	}
	
	  public static void main(String []args) {
		String s = "Monti Baba Gupta";
		  String arr[] = s.split(" ");
		 
		  for (int i = 0; i < arr.length; i++) {
			for (int j =arr[i].length()-1;j>=0 ;j--) {
				System.out.print(arr[i].charAt(j));
			}
			System.out.print(" ");
		} 
		   
		
	  }

	  } 
	

	
