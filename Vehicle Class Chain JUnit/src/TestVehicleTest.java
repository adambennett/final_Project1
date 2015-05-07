import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestVehicleTest {

	@BeforeClass public static void setUpBeforeClass() throws Exception {}
	@AfterClass public static void tearDownAfterClass() throws Exception {}
	@Before public void setUp() throws Exception {}
	@After public void tearDown() throws Exception {}
	
	@Test
	public void testCarCreation()
	{
		Person a = new Person();
		Car aCar = new Car(a, 4);
		
		assertNotNull(aCar.getOwner());
		assertEquals(aCar.getNumberOfDoors(), 4);
	}
	
	@Test
	public void testTruckCreation()
	{
		Person a = new Person();
		Truck aTruck = new Truck(a, 2);
		
		assertNotNull(aTruck.getOwner());
		assertEquals(aTruck.getNumberOfAxels(), 2);
	}
	
	@Test
	public void testMotorcycleCreation()
	{
		Person a = new Person();
		Motorcycle singleSeater = new Motorcycle(false);
		
		assertFalse(singleSeater.hasSideCar());
	}
	
	@Test
	public void ownershipTransferred()
	{
		Person a = new Person();
		Person b = new Person();
		Truck aTruck = new Truck(a, 2);
		aTruck.transferOwnership(b);
		
		assertTrue(aTruck.getOwner() == b);

	}
}
