package storingobjects;

public class Person {
	
	String name;
	Integer marks;
	public Person(String name, Integer marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return name+" had scored "+marks+" Marks";
	}
	
	

}
