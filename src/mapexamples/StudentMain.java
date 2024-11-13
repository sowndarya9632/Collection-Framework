package mapexamples;

import java.util.Set;
import java.util.TreeMap;

public class StudentMain {
	public static void main(String[] args) {
		
		StudentNameComparator name = new StudentNameComparator();
		
		TreeMap<Student,Integer> tm = new TreeMap<Student, Integer>(name);
		tm.put(new Student("Tom"),98);
		tm.put(new Student("Jerry"),48);
		tm.put(new Student("Alex"),75);
		
		Set<Student> st=tm.keySet();
		
		for(Student s: st) {
			System.out.println(s+" Marks: "+tm.get(s));
		}
		
		
	}

}
