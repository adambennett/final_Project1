
public abstract class Vehicle implements VehicleInterface
{
	private String Name;
	private String Color;
	private int Weight;
	private Person Owner;
	
	public Person getOwner() { return Owner; }
	public void setOwner(Person owner) { Owner = owner; }

	public void transferOwnership(Person newOwner)
	{
		this.Owner = newOwner;
	}
}
