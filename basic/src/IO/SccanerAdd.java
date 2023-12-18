package IO;

import java.util.Scanner;

public class SccanerAdd {
    

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first digit:");
		int a = sc.nextInt();
		System.out.print("Enter Second digit:");
		int b = sc.nextInt();
		int c = a*b;
		System.out.println(c);

	}
}
