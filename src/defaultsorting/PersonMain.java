package defaultsorting;

import java.util.TreeSet;

public class PersonMain {
	public static void main(String[] args) {
		Person p1 = new Person(20,"Tom");
		Person p2 = new Person(24,"Jerry");
		
		TreeSet<Person> ts = new TreeSet<Person>();
		ts.add(p1);
		ts.add(p2);
		
		for(Person p : ts) {
			System.out.println(p);
		}
		
	}

}
