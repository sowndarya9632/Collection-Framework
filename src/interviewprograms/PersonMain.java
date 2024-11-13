package interviewprograms;

import java.util.ArrayList;

public class PersonMain {
	public static void main(String[] args) {

		ArrayList<Person> al = new ArrayList<Person>();
		al.add(new Student());
		al.add(new Employee());

		for(Person obj : al) {
			if(obj instanceof Student) {
				Student s =(Student)obj;
				System.out.println("Student marks are: "+s.marks);
			}
			else if(obj instanceof Employee) {
				Employee e =(Employee)obj;
				System.out.println("Employee Salary is: "+e.salary);

			}
		}

	}

}
