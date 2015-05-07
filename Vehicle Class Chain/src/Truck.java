
public class Truck extends Vehicle {

	private int NumberOfAxels;
	
	Truck()
	{
		
	}
	
	Truck(Person owner, int numberOfAxels)
	{
		setOwner(owner);
		setNumberOfAxels(numberOfAxels);
	}

	public int getNumberOfAxels() { return NumberOfAxels; }
	public void setNumberOfAxels(int numberOfAxels) { NumberOfAxels = numberOfAxels; }
}
