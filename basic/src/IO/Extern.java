package IO;

import java.io.*;

public class Extern implements Externalizable {

	private String id;
	private String name = null;
	private transient int temp;

	public Extern() {
		// TODO Auto-generated constructor stub
	}

	public Extern(String id, String name, int temp) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.temp = temp;
	}

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		id = (String) in.readObject();
		name = (String) in.readObject();
		temp = in.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(id);
		out.writeObject(name);
		out.writeInt(temp);
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Extern e = new Extern("5", "maYANK", 5);
		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("E:/a.txt"));
		os.writeObject(e);
		os.flush();
		os.close();
		ObjectInputStream oi = new ObjectInputStream(new FileInputStream("E:/a.txt"));
		Extern e2 = (Extern) oi.readObject();
		oi.close();
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getTemp());

	}

}
