package mapexamples;

public class Employee implements Comparable<Employee> {
	
	int id;

	public Employee(int id) {
		super();
		this.id = id;
	}
	
	@Override
	public String toString() {

		return "ID: "+id;
	}
	
	@Override
	public int compareTo(Employee o) {
		
		return this.id-o.id;
	}

}
