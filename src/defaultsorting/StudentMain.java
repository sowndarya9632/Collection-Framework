package defaultsorting;

import java.util.Iterator;
import java.util.TreeSet;

public class StudentMain {
	public static void main(String[] args) {
		Student s1 =  new Student(22);
		Student s2 = new Student(24);
		Student s3 = new Student(20);
		
		TreeSet<Student> ts= new TreeSet<Student>();
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		
		for(Student obj:ts) {
			System.out.println(obj);
		}
		
		System.out.println("---------------------------");
		
		Iterator<Student> itr = ts.descendingIterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
