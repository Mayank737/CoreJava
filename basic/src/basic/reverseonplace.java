package basic;

public class reverseonplace {
	public static void main(String[] args) {
		String name = "Ram rahim";
		
		
		String[] name2 = name.split(" ");
		//System.out.print("Reverse String is : ");
		String a = name2[0];
		String[] b = a.split("");
		for(int i=(a.length()-1);i>=0;i--)
		{
			System.out.print(b[i]);
			
		}}
}
