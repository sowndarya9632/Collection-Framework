package defaultsorting;

public class Person implements Comparable<Person> {
	int age;
	String name;

	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {

		return "Name "+name+" Age: "+age ;
	}

	@Override
	public int compareTo(Person o) {

		return this.name.compareTo(o.name);
	}

}

/*
 * this -> current object to be inserted 
 * p -> already existing Object
 * 
 * 1. Sorting based on age(int) :
 * 		- Ascending Order  -> return this.age-o.age;
 * 		- Descending Order -> return o.age-this.age;
 * 
 * 2. Sorting Based on Name (String):
 * 		- Ascending Order  -> return this.name.compareTo(o.name);
 * 		- Descending Order -> return o.name.compareTo(this.name); 
 * 
 * 3. Sorting based on age if Wrapper class declaration -> Integer age;
 * 		- Ascending Order  -> return this.age.compareTo(o.age);
 * 		- Descending Order -> return o.age.compareTo(this.age);
 * 
 * 
 * Note:
 * 1. Sorting can Happen on only 1 Parameter at  a time.
 * 2. For String comparison, do nut use (-), use compareTo() of String class.
 */

