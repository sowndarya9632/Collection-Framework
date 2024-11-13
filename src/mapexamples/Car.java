package mapexamples;

public class Car {
	
	String brand;
	int cost;
	public Car(String brand, int cost) {
		super();
		this.brand = brand;
		this.cost = cost;
	}
	
	@Override
	public String toString() {

		return "Brand: "+brand+" "+"Cost: "+cost ;
	}

}
