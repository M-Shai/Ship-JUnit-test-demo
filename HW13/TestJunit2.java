import org.junit.Test;
import static org.junit.Assert.*;

/**
 * TestJunit2
 * Test CruiseShip class methods
 * getPassengers()
 * toString()
 */
public class TestJunit2 
{

	@Test
	public void testCruiseShipMethods() 
	{
		String shipName = "Norther Lights";
		String buildDate = "2021";
		int passengers = 4970;
		
		String str1 = "Name: " +shipName + 
				"\nMaximum passengers: " + passengers;
		String str2 =  "Name: " +shipName + 
				"\nMaximum passengers: " + 4971;
		
		//Create CruiseShip object with values
		CruiseShip cruiseShip = 
				new CruiseShip(shipName, buildDate, passengers);
		
		System.out.println("Running CruiseShip method tests");
		
		//***Testing getPassengers()
		System.out.println("Testing getPassengers()");
		//Compare passengers value to getPassengers() return value
		//expect true comparison
		assertEquals(passengers, cruiseShip.getPassengers());
		//compares 4971 to getPassengers return value
		//expect false comparison
		assertFalse(4971 == cruiseShip.getPassengers());
		
		//***Testing toString()
		System.out.println("Testing cruiseShip.toString()");
		//Compare str1 to toString() return value
		//expect true comparison
		assertEquals(str1, cruiseShip.toString());
		//Compare str2 to toString() return value
		//Expect false comparison
		assertFalse(str2 == cruiseShip.toString());
	}
}