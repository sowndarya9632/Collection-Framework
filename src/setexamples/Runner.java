package setexamples;

import java.util.Iterator;
import java.util.TreeSet;

public class Runner {
	public static void main(String[] args) {
		
	TreeSet<Integer> ts = new TreeSet();
	ts.add(100);
	ts.add(50);
	ts.add(150);
	ts.add(50);
	ts.add(25);
	ts.add(75);
	ts.add(100);
	ts.add(125);
	ts.add(175);
	System.out.println(ts);
	
	
	
	
//	System.out.println(ts.ceiling(100));
//	System.out.println(ts.higher(45));
//	System.out.println(ts.headSet(100));
//	System.out.println(ts.subSet(50,150));
	
        Iterator itr =ts.descendingIterator();
        
        while(itr.hasNext()) {
        	System.out.print(itr.next()+" ");
        }
	

	}
}
