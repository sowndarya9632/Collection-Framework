package defaultsorting;

public class Employee implements Comparable<Employee> {
	Double salary;  // Wrapper Class Declaration
	String name;
	
	
	
	public Employee(double salary,String name) {
		this.name=name;
		this.salary=salary;
	}
	
	@Override
	public String toString() {
		
		return "Salary of "+name+" is "+salary+" LPA";
	}
	
	@Override
	public int compareTo(Employee o) {
		
		return this.salary.compareTo(o.salary);
	}
	
	

}
