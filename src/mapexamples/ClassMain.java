package mapexamples;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class ClassMain {
	public static void main(String[] args) {

		Car c1 =new Car("Audi",200000);
		Car c2=new Car("Range Rover",500000);

		LinkedHashMap<Car,String> lm = new LinkedHashMap<Car, String>();

		lm.put(c1,"White");
		lm.put(c2,"Blue");

		Set<Car> st=lm.keySet();

		for(Car key :st) {

			System.out.println(key+" Color: "+lm.get(key));

		}
		
		System.out.println("---------------------------");

		Set s=lm.entrySet();
		Iterator itr =s.iterator();

		while(itr.hasNext()) {
			System.out.println(itr.next());
		}





	}

}
