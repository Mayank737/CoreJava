package IO;

import java.io.FileReader;

public class Filereader {


	public static void main(String[] args) throws Exception 
	{
		FileReader reader = new FileReader("D:\\Baba.txt");
		int ch = reader.read();
	
		
		while(ch!=-1)
		{
		char chr = (char)ch;
			System.out.print(chr);
			ch=reader.read();
		}
		System.out.println("adsfkn");
	}
	
}
