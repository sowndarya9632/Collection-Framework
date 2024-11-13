package storingobjects;

import java.util.Comparator;

public class PersonMarksComparator implements Comparator<Person> {
	
	@Override
	public int compare(Person o1, Person o2) {
		
		return o1.marks.compareTo(o2.marks);
	}
	

}
