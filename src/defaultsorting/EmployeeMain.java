package defaultsorting;

import java.util.Iterator;
import java.util.TreeSet;

public class EmployeeMain {
	public static void main(String[] args) {
		
		TreeSet<Employee> ts = new TreeSet<Employee>();
		
		ts.add(new Employee(5.6,"Alex"));
		ts.add(new Employee(6.4,"Smith"));
		ts.add(new Employee(8.25,"Jones"));
		
		Iterator<Employee> its= ts.iterator();
		
		while(its.hasNext()) {
			System.out.println(its.next());
		}
		
		System.out.println("-------------------------------");
		
		Iterator<Employee> ds=ts.descendingIterator();
		
		while(ds.hasNext()) {
			System.out.println(ds.next());
		}
		
		
	}

}
