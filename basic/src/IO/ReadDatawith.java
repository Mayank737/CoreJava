package IO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadDatawith {
  
	  public static void main(String[] args) {
		File inf = new File("E:/in.dat");
		File outf = new File("E:/out.dat");
		
		FileReader ins = null;
		FileWriter outs = null;
		
		try {
			ins =new FileReader(inf);
			outs = new FileWriter(outf);
			int ch;
			while ((ch = ins.read())!=-1) {
				outs.write(ch);
			}
			
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e);
			System.exit(-1);
		} finally {
			try {
				ins.close();
				outs.close();
			} catch (IOException e2) {
				// TODO: handle exception
			}
		}
		System.out.println("success");
		
	}
}
