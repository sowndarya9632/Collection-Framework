package defaultsorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class CarMain {
	
	public static void main(String[] args) {
		
		ArrayList<Car> ac = new ArrayList<Car>();
		ac.add(new Car(20000));
		ac.add(new Car(32000));
		ac.add(new Car(50000));
		
		Collections.sort(ac);
		
		for(Car c : ac) {
			System.out.println(c);
		}
	}

}
