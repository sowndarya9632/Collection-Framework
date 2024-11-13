package customsorting;

import java.util.Comparator;

public class StudentAgeComparator implements Comparator<Student> {

	@Override
	public int compare(Student x, Student y) {

		return x.age-y.age;  // return y.age-x.age;
	}

}


//   x -> current object to be inserted
//   y -> Already Existing object