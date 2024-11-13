package traversingobjects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Test {
	public static void main(String[] args) {
		
		ArrayList<String> l = new ArrayList<String>();
		l.add("Allen");
		l.add("Smith");
		l.add("Richard");
		l.add("Michel");
		
	Iterator<String> itr =l.iterator();
	
	while(itr.hasNext()) {
	System.out.println(itr.next());
	}
	
	System.out.println("----------------------");
	
	ListIterator<String> ltr =l.listIterator();
	while(ltr.hasNext()) {
		System.out.println(ltr.next());
	}
	System.out.println("-----");
	while(ltr.hasPrevious()){
		System.out.println(ltr.previous());
	}
	
	System.out.println("-------------------");
	
      ListIterator<String> ltr2 = l.listIterator(l.size());
	while(ltr2.hasPrevious()) {
		System.out.println(ltr2.previous());
	}
		
	}

}
