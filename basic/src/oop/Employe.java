package oop;

public class Employe {
   private int ID;
   private String name;
   private Address add;
   
   public Employe (int ID,String name,Address add) {
	   this.ID = ID;
	   this.setName(name);
	   this.add = add;
   }

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
}
