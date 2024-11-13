package customsorting;

import java.util.TreeSet;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee e1 = new Employee(103,"Alex");
		Employee e2 = new Employee(101,"Smith");
		Employee e3 = new Employee(102,"Jack");
		
		EmployeeeIdComparator id = new EmployeeeIdComparator();
		EmployeeNameComparator name = new EmployeeNameComparator();
		
		TreeSet<Employee> ts = new TreeSet<Employee>(name);
		
		ts.add(e3);
		ts.add(e1);
		ts.add(e2);
		
		for(Employee e : ts) {
			
			System.out.println(e);
			
		}
		
	}

}
