package oop;

import java.util.ArrayList;
import java.util.List;

public class Onetomanytest {
  
	  List<Book>Books;
	  public Onetomanytest( List<Book>Books) {
		  
		  this.Books = Books;
	  }
	  public List<Book>getBook(){
		  return Books;
	  }
	  
	   public static void main(String[] args) {
		Book b1 = new Book("java","Monti");
		Book b2 = new Book("phthon","Java");
		
		List<Book>list = new ArrayList<Book>();
		list.add(b1);
		list.add(b2);
		Onetomanytest opp = new Onetomanytest(list);
		List<Book> lb = opp.getBook();
		for (Book b : lb) {
			//System.out.println(b.title);
			System.out.println(b.author + b.title);
			
		}
	}

}
