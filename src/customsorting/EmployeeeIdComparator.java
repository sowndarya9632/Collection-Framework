package customsorting;

import java.util.Comparator;

public class EmployeeeIdComparator implements Comparator<Employee> {
	
	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.id.compareTo(o2.id);
	}

}
