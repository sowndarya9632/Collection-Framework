package mapexamples;

public class Student {
	String name;

	public Student(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public String toString() {

		return "Name: "+name;
	}

}
