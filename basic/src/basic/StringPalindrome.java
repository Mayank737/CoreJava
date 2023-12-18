package basic;

public class StringPalindrome {
 
	  public static void main(String[] args) {
		
		  String str = "Monti";
		  String rvs = reverseString(str);
		  if (str.equals(rvs)) {
			System.out.println("the String is palindrome - "+str);
		} else {
            System.out.println("the String is not a palindrome - "+str);
            
		}
	}

	private static String reverseString(String str) {
		// TODO Auto-generated method stub
		String rvs = "";
		for (int i =str.length()-1;i>=0; i--) {
			rvs +=str.charAt(i);
		}
		
		return rvs;
	}
}
