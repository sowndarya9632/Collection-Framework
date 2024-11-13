package storingobjects;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class CountryMain {
	public static void main(String[] args) {
		
		Stack s= new Stack();
		LinkedList l = new LinkedList();
		
		l.add(new Country(140,"India"));
		l.add(new Country(40,"Russia"));
		
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
		
		System.out.println("----------------------");
		
		for(Object obj :l) {
			System.out.println(obj);
		}
		System.out.println("--------------------------");
		
		Iterator ir=l.iterator();
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
		
	}

}
