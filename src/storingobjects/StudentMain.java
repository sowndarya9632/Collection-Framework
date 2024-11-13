package storingobjects;

import java.util.ArrayList;
import java.util.Collections;

public class StudentMain {
	public static void main(String[] args) {
	
	ArrayList<Person> al = new ArrayList<Person>();
	
	al.add(new Person("Tom",94));
	al.add(new Person("Jerry",74));
	al.add(new Person("smith",56));
	al.add(new Person("Allen",87));
	
	Collections.sort(al,new PersonMarksComparator());
	
	System.out.println(al.get(al.size()-1));
	System.out.println(al.get(0));
	
	
	}

}
