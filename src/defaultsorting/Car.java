package defaultsorting;

public class Car implements Comparable<Car> {
	Integer cost;

	public Car(int cost) {
		super();
		this.cost = cost;
	}
	
	@Override
	public String toString() {
		
		return "Cost: "+cost;
	}
	
	@Override
	public int compareTo(Car o) {
		
		return this.cost.compareTo(o.cost);
	}
	
	
	

}
