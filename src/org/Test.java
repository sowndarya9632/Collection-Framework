package org;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;

public class Test {
	public static void main(String[] args) {
		
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		
		
		LinkedList ll = new LinkedList();//[[10, 20, 30], 40]
		ll.add(al);
		ll.add(40);
		System.out.println(ll);//[10, 20, 30, 40]
		System.out.println(ll.contains(al));
		
//		System.out.println("---------------------------");
//		
//		LinkedList l = new LinkedList(al);
//		l.add(40);
//		System.out.println(l);
//		System.out.println(l.contains(al));
		
		System.out.println("------------------------");
		
		ArrayList a = new ArrayList();
		a.add(10);
		a.add(20);
		
		ArrayList li = new ArrayList();
//		li.add(a);
		li.addAll(a);
		li.add(40);
		System.out.println(li);
		System.out.println(li.contains(a));
		System.out.println("Elements: "+li+" Size: "+li.size());
		
		
/*
 * a -> ArrayList and li-> Linkedlist
 * 
 * 1. If we Use -> li.addall(a); -> We are adding
 */
		
		
	}

}
