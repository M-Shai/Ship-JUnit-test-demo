import org.junit.Test;
import static org.junit.Assert.*;

/**
 * TestJunit1
 * Test Ship class methods
 * getName()
 * getYearBuilt()
 * toString()
 */
public class TestJunit1 
{

	@Test
	public void testShipMethods() 
	{
		String shipName = "Enterprise";
		String buildDate = "1977";
		
		String str1 = "Name: " + shipName + "\nYear built: " + buildDate;
		String str2 = "Name: " + shipName + "\nYear built: " + 1978;
		
		//Create ship object with values
		Ship ship = new Ship(shipName, buildDate);
		
		System.out.println("Running Ship method tests");
		
		//***Testing getName()
		System.out.println("Testing getName()");
		//Compare shipName to getName() return value
		//expect true comparison
		assertEquals(shipName, ship.getName());
		//Compare "Enterprise2" to getName() return value
		//expect false comparison
		assertFalse("Enterprise2" == ship.getName());
		
		//***Testing getYearBuilt()
		System.out.println("Testing getYearBuilt()");
		//Compare buildDate to getYearBuilt() return value
		//expect true comparison
		assertEquals(buildDate, ship.getYearBuilt());
		//Compare "1978" to getYearBuilt() return value
		//expect false comparison
		assertFalse("1978" == ship.getYearBuilt());
		
		//***Testing toString()
		System.out.println("Testing ship.toString()");
		//Compare str1 to toString() return value
		//expect true comparison
		assertEquals(str1, ship.toString());
		//Compare str2 to toString() return value
		//expect false comparison
		assertFalse(str2 == ship.toString());
	}
}