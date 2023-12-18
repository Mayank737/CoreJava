package Collection2;

import java.util.ArrayList;
import java.util.Random;

public class Randomnumber {

	public static void main(String[] args) {
		int j=1;
		ArrayList list=new ArrayList();
		for(int p=1; p<=1000; p++) {
			list.add(p);
		}
		Random r=new Random();
		for(int i=1;i<=5;i++) {
			int p=r.nextInt(1000);
			System.out.println(j++ +"  "+list.get(p));
		}}
}
