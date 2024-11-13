package mapexamples;

import java.util.LinkedHashMap;
import java.util.Set;

public class Solution {
	public static void main(String[] args) {
		
		LinkedHashMap<String ,Integer> lm = new LinkedHashMap<String,Integer>();
		
		lm.put("John",20);
		lm.put("Jack",21);
		
	Set<String> st=lm.keySet();
	
	for(String i : st) {
		System.out.println(i+" is "+lm.get(i)+" years of Old");
	}
	
	}

}
