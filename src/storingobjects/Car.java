package storingobjects;

public class Car {
	
	Integer cost;

	public Car(int cost) {
		super();
		this.cost = cost;
	}
	
	@Override
	public String toString() {
		
		return "Cost: "+cost;
	}
	

}
