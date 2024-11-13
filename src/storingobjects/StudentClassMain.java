package storingobjects;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentClassMain {
	public static void main(String[] args) {
		
	
	Student s1 = new Student(22, "Tom");
	Student s2 = new Student(20, "Jerry");
	
	ArrayList<Object>al = new ArrayList<Object>();
	
	al.add(s1); // al.add(new Student(22,"Tom"));
	al.add(s2); // al.add(new Student(20,"Jerry"));
	
	System.out.println(al);
	System.out.println("------------------------");
	
	     Iterator itr=al.iterator();
	     
	     for(Object obj:al) {
	    	 System.out.println(obj);
	     }
	     
	     System.out.println("------------------");
	     
	     while(itr.hasNext()) {
	    	 System.out.println(itr.next());
	     }

	}
}
