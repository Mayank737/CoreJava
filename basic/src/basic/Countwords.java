package basic;

public class Countwords {
 
	public static void main(String[] args) {
	
		int j = 0;
		
		String name = "montiii gupta";
		for(char letter = 'a'; letter<='z';letter++) {
			
			for(int i=0; i<=name.length()-1;i++) {
				if(name.charAt(i)==letter) {
					j++;
				}
				if(j>0) {
					System.out.println(letter+"="+j);
					j=0;
				}
			}
			
		}
	}
}
