package defaultsorting;

public class Student implements Comparable<Student>{
	Integer age;
	public Student(int age) {
		this.age=age;
	}
	
	@Override
	public String toString() {
		
		return "Age: "+age;
	}
	
	@Override
	public int compareTo(Student o) {
		
//		return this.age-o.age;   // Ascending Order
		return o.age-this.age;  // Descending Order
	}
}

// this -> Current object to be inserted
// s -> already existing object


