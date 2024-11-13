package org;

import java.util.*;

public class Solution {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Java");
		ll.add("Python");
		ll.add("Sql");
		ll.add("MERN");
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		System.out.println("----------------");
		
		for(int i:al) {
			System.out.println(i);
		}
		System.out.println("---------------");
		
		Iterator<Integer> itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("----------------");
	
		ListIterator<Integer> litr=al.listIterator(al.size());
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
		
		System.out.println("-----------------");
		
		Iterator<String> i=ll.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("-----------------");
		ListIterator<String> li=ll.listIterator(ll.size());
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		
	}
}
