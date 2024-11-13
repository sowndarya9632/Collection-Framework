package traversingobjects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.LinkedList;

public class Demo {

	public static void main(String[] args) {
		

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(45);
		al.add(56);
		al.add(74);
		al.add(973);

		Iterator<Integer> itr=al.iterator();

		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println("------------------------");

		ListIterator<Integer> ltr=al.listIterator(al.size());
		
		while(ltr.hasPrevious()){
			System.out.println(ltr.previous());
		}

		
		System.out.println("-------------------------");

		while(ltr.hasNext()) {
			System.out.println(ltr.next());
		}
		
//		Iterator re = itr.remove();

	}

}
