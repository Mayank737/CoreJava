package collection;

import java.util.Stack;

public class StackExamp {
	public static void main(String[] args) {
		Stack s =new Stack();
		for(char i='a';i<='z';i++) {
			System.out.print(s.push(i));	
		}
		
		Stack r=new Stack<>();
		while(!s.isEmpty()) {
			System.out.println(r.push(s.pop()));
		}
		while(!r.isEmpty()) {
			System.out.print(s.push(r.pop()));
		}
}
}