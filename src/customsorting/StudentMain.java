package customsorting;

import java.util.TreeSet;

public class StudentMain {
	public static void main(String[] args) {
		Student s1 = new Student(26);
		Student s2 = new Student(21);
		Student s3 = new Student(29);

		//		StudentAgeComparator age =new StudentAgeComparator();
		//		TreeSet<Student> ts = new TreeSet<Student>(age);

		TreeSet<Student> ts = new TreeSet<Student>(new StudentAgeComparator() );

		ts.add(s3);
		ts.add(s2);
		ts.add(s1);

		for(Student obj:ts) {

			System.out.println(obj);
		}

	}

}
