package traversingobjects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class StudentMain {
	public static void main(String[] args) {

		Student s1 = new Student(22,"Alex");
		Student s2 = new Student(24,"John");

		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s2);
		al.add(s1);

		Iterator<Student>itr	=al.iterator();

		while(itr.hasNext()) {

			Student s =itr.next();
			System.out.println("Age: "+s.age+" Name: "+s.name);
		}
		System.out.println("----------------------------------");
		
		ListIterator<Student> lt =al.listIterator(al.size());
		
		while(lt.hasPrevious()) {
			
			Student s =lt.previous();
			System.out.println("Age: "+s.age+" Name: "+s.name);
			
		}


	}

}
