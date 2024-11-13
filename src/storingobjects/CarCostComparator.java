package storingobjects;

import java.util.Comparator;

public class CarCostComparator implements Comparator<Car> {
	
	@Override
	public int compare(Car o1, Car o2) {
		
		return o1.cost.compareTo(o2.cost);
		
	}
	

}
