package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadImage {
  

	public static void main(String[] args) throws Exception {


		FileInputStream file = new FileInputStream("E:/music/index1.jpg");
		int i = file.read();
		while(i != -1) {
		try {	char c = (char)i;
			System.out.print(c);
			i = file.read();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}}
		
	}}
