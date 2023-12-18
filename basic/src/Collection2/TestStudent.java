package Collection2;

import java.util.Comparator;

public class TestStudent implements Comparator<Strudent>{
	public int compare(Strudent o1, Strudent o2) {
		// TODO Auto-generated method stub
		if (o1.getFirstname()==o2.getFirstname()) {
			return o1.getLastname().compareTo(o2.getLastname());
		}
		else {
			return (o1.getFirstname().compareTo(o2.getFirstname()));
		}
	}
     
	     
}
