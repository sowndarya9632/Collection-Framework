package storingobjects;

import java.util.ArrayList;
import java.util.Collections;

public class CarMain {
	public static void main(String[] args) {
		
		ArrayList<Car> al = new ArrayList<Car>();
		
		al.add(new Car(200344));
		al.add(new Car(405633));
		al.add(new Car(344534));
		
		System.out.println(al);
		
		Collections.sort(al,new CarCostComparator());
		
		for(Car c : al) {
			System.out.println(c);
		}
		
		
	}

}
