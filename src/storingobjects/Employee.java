package storingobjects;

public class Employee {
	Integer id;
	String name;
	public Employee(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		
		return "Emp id of "+name+" is "+id ;
	}
	

}
