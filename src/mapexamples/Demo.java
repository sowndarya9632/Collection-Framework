package mapexamples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo {
	public static void main(String[] args) {
		
		Map m = new HashMap();
		
		m.put(10,"A");
		m.put(1.4,'D');
		m.put(true,"Yash");
		m.put('y',null);
		m.put(18,"Virat");
		
		System.out.println(m);
		
		System.out.println(m.size());
		System.out.println(m.get(10));
		System.out.println(m.get(18));
		System.out.println(m.containsKey(true));
		System.out.println(m.containsValue(null));
		System.out.println(m.containsKey(34));
		System.out.println("-------------------------");
		
		System.out.println(m);
		m.remove(1.4);
		System.out.println(m);
		System.out.println("---------------");
		
		System.out.println(m.isEmpty());
		m.clear();
		System.out.println(m.isEmpty());
		
	    	Set s=m.keySet();
	    	Iterator itr=s.iterator();
	    	
	    	while(itr.hasNext()){
	    		System.out.println(itr.next());
	    	}
		
	}

}
