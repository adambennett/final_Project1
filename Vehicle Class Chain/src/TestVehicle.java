
public class TestVehicle {

	public static void main(String[] args) {
		Person a = new Person();
		Person b = new Person();
		
		Car aCar = new Car(a, 4);
		Truck aTruck = new Truck(a, 2);
		Motorcycle singleSeater = new Motorcycle(false);
		
		aTruck.transferOwnership(b);
	}

}
