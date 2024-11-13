package storingobjects;

public class Country {
	int population;
	String name;
	
	public Country(int population,String name) {
			this.name=name;
			this.population=population;
	}
	
	@Override
	public String toString() {
		return name+" has a Population of "+population+" Crores";
	}

}
