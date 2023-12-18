package IO;

import java.io.FileReader;
import java.util.Scanner;

public class ScannerRead {


	public static void main(String[] args) throws Exception {


		FileReader reader = new FileReader("SCRead");
		Scanner sc = new Scanner(reader);
		while(sc.hasNextInt()) {
			String line = sc.nextLine();
			System.out.println(line);
		}
		
}}
