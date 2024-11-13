package mapexamples;

import java.util.Set;
import java.util.TreeMap;

public class Employeemain {

	public static void main(String[] args) {
		
		TreeMap<Employee, String> tm = new TreeMap<Employee, String>();
		
		tm.put(new Employee(101),"John");
		tm.put(new Employee(123),"Alex");
		tm.put(new Employee(144),"Hitler");
		
		Set<Employee> s=tm.keySet();
		
		for(Employee e :s) {
			System.out.println(e+" "+"Name: "+tm.get(e));
		}
		
	}
}
