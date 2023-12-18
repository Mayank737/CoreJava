package basic;

public class StringCounttotal {
   
	  

	public static void main(String[] args) {
		
		String s = "montiiii";
		char [] ch = s.toCharArray();
		int count = 0;
		
		for (char c : ch) {
			
			for (int i = 0; i < ch.length; i++) {
				if (ch[i]==c) {
					count++;
				}
			}
			System.out.println(c + "=" + count);
			count = 0;
		}
		
	}

}
