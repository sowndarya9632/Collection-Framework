package org;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {
	public static void main(String[] args) {
		ArrayList<Integer> ai = new ArrayList<Integer>();
		ai.add(140);
		ai.add(50);
		ai.add(30);
		System.out.println(ai);
		Collections.sort(ai);
		System.out.println(ai);
		Collections.reverse(ai);
		System.out.println(ai);
		
		System.out.println("--------------------");
		
		ArrayList al = new ArrayList();
//		System.out.println(al.size());
		al.add(44);
		al.add("Yash");
		al.add(10.45);
		al.add(true);
		System.out.println(al);
//		Collections.sort(al);
		Collections.reverse(al);
		System.out.println(al);
		
		
	}

}
