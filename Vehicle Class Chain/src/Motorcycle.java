
public class Motorcycle extends Vehicle {
	
	private boolean hasSideCar;
	
	Motorcycle()
	{
		
	}
	
	Motorcycle(boolean sideCar)
	{
		setSideCar(sideCar);
	}

	public boolean hasSideCar() { return hasSideCar; }
	public void setSideCar(boolean hasSideCar) { this.hasSideCar = hasSideCar; }
}
