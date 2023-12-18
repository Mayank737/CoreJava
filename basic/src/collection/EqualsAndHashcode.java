package collection;

public class EqualsAndHashcode {
  

	int id;

	public EqualsAndHashcode(int id) {
		this.id=id;
	}
	
@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null)
			return false;
		if (getClass() != o.getClass())
			return false;
		EqualsAndHashcode s = (EqualsAndHashcode) o;
		if (id != s.id)
			return false;
		return true;
	}

}
