/**
   The CargoShip class stores data about  
   a ship that is a cargo ship for the
   Ship, CruiseShip, and CargoShip Classes 
   programming challenge.
*/

public class CargoShip extends Ship
{
   private int tonnage;    // Cargo tonnage

   /**
      Constructor
      @param n The ship's name.
      @param y The year the ship was build.
      @param t The cargo tonnage.
   */

   CargoShip(String n, String y, int t)
   {
      // Call the superclass constructor (Ship),
      // passing the name and year as arguments.
      super(n, y);
      
      // Set tonnage.
      tonnage = t;
   }
   
   /**
      setTonnage method
      @param t The maximum cargo tonnage.
   */
   public void setTonnage(int t)
   {
      tonnage = t;
   }
   
   /**
      getTonnage method
      @return The ship's cargo capacity in tons.
   */
   public int getTonnage()
   {
      return tonnage;
   }

   /**
      toString method
      @return A string indicating the ship's name
              and the cargo capacity.
   */
   public String toString()
   {
      return "Name: " + getName() + "\nCargo capacity: " +
             tonnage + " tons";
   }
}