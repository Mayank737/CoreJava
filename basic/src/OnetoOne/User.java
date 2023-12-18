package OnetoOne;

public class User extends Role{
         String name;
         String add;
         
         public User(String rolename,String name,String add) {
        	 super(rolename);
        	 this.name=name;
        	 this.add=add;
		}
         public static void main(String[] args) {
			User u = new User("Admin","Monti","oon");
			System.out.println(u.add+u.name+u.rolename);
		}
         
}
