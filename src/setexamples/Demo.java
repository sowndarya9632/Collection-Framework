package setexamples;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Demo {
	public static void main(String[] args) {
				
		ArrayDeque ad = new ArrayDeque();
		System.out.println(ad.size());
		ad.add(null);
		ad.add(70);
		ad.addFirst(10);
		ad.addLast(50);
		ad.addLast(20);
		ad.addFirst(30);
		System.out.println(ad);
		System.out.println(ad.getFirst());
		System.out.println(ad.getLast());
		ad.removeFirst();
		ad.removeLast();
		System.out.println(ad);
		
		System.out.println("----------------------");
		
		
		HashSet hs = new HashSet();
		hs.add(10);
		hs.add(1.2);
		hs.add(10);
		hs.add(null);
		hs.add("Java");
		System.out.println(hs+"\n-----------");
		
		System.out.println("Size: "+hs.size());
		
		for(Object obj:hs) {
			System.out.println(obj);
		}
		
		System.out.println("=====================");
		
		LinkedHashSet<Integer>lhs = new LinkedHashSet<Integer>();
		lhs.add(10);
		lhs.add(30);
		lhs.add(50);
		lhs.add(10);
		lhs.add(20);
		System.out.println(lhs+"\n-----------");
		
		System.out.println("Size: "+lhs.size());
		
		for(int i:lhs) {
			System.out.println(i);
		}
	}

}
