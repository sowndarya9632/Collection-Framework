package mapexamples;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MainClass {
	public static void main(String[] args) {
		
	Map<Double, String> map = new TreeMap<Double,String>();
	map.put(5687.54,"Jack");
	map.put(6548.96,"Alex");
	map.put(23456.76,"Smith");
	
	Set<Double> s =map.keySet();
	
	for(double obj:s) {
		System.out.println("The Salary of "+map.get(obj)+" is "+obj);
	}

	}
}
