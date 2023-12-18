package IO;

import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.Buffer;

public class ImageRead {

	   public static void main(String[] args) throws IOException{
		
		    BufferedImage image = null;
		    FileInputStream fis = new FileInputStream("E:/music/index.jpg");
		    
		    FileOutputStream fo = new FileOutputStream("E:/music/index1.jpg");
		    int ch = 0;
		    while (ch!= -1) {
				ch = fis.read();
				fo.write(ch);
			}
		    System.out.println("succes");
	}
}
