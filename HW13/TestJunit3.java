import org.junit.Test;
import static org.junit.Assert.*;

/**
 * TestJunit3
 * Test CargoShip methods
 * getTonnage()
 * toString()
 */
public class TestJunit3 
{

	@Test
	public void testCargoShipMethods() 
	{
		String shipName = "Northern Lights";
		String buildDate = "2021";
		int tonnage = 65000;
		
		String str1 = "Name: " + shipName + "\nCargo capacity: " + 
				tonnage + " tons";
		String str2 = "Name: " + shipName + "\nCargo capacity: " + 
				65001 + " tons";
		
		//Create CargoShip object with values
		CargoShip cargoShip = 
				new CargoShip(shipName, buildDate, tonnage);
		
		System.out.println("Running CargoShip method tests");
		
		//***Testing getTonnage()
		System.out.println("Testing getTonnage()");
		//compares tonnage value to getTonnage() return value
		//expect true comparison
		assertEquals(tonnage, cargoShip.getTonnage());
		//compares 65001 to getTonnage() return value
		//expect a false comparison
		assertFalse(6501 == cargoShip.getTonnage());
		
		//***Testing toString()
		System.out.println("Testing cargoShip.toString()");
		//compare str1 toString() return value
		//expect true comparison
		assertEquals(str1, cargoShip.toString());
		//compare str2 toString() return value
		//expect a false comparison
		assertFalse(str2 == cargoShip.toString());
	}
}
