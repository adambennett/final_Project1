
public class Car extends Vehicle {
	
	private int NumberOfDoors;

	Car()
	{
		
	}
	
	Car(Person owner, int numberOfDoors)
	{
		setOwner(owner);
		setNumberOfDoors(numberOfDoors);
	}
	
	public int getNumberOfDoors() { return NumberOfDoors; }
	public void setNumberOfDoors(int numberOfDoors) { NumberOfDoors = numberOfDoors; }
}
