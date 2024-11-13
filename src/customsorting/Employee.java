package customsorting;

public class Employee  {
	Integer id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		
		return "Employee  id of "+name+" is "+id;
	}
	

}
