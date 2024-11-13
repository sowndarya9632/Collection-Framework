package mapexamples;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class Test {
	public static void main(String[] args) {

		LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer, String>();
		hm.put(10,"Iphone");
		hm.put(44,"Xeomi MI");
		hm.put(54,"Realme");
		hm.put(65,"Samsung");
		
		Set<Integer> s=hm.keySet();
		
		for(int key : s) {
			System.out.println(key+"->"+hm.get(key));
		}
		
		System.out.println("--------------------------------");
		
		Iterator<Integer> itr=s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		
		
	}
}
