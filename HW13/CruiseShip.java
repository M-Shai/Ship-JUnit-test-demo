/**
   The CruiseShip class stores data about  
   a ship that is a cruise ship for the
   Ship, CruiseShip, and CargoShip Classes 
   programming challenge.
*/

public class CruiseShip extends Ship
{
   private int passengers;    // Maximum number of passengers

   /**
      Constructor
      @param n The ship's name.
      @param y The year the ship was build.
      @param p The maximum number of passengers.
   */

   CruiseShip(String n, String y, int p)
   {
      // Call the superclass constructor (Ship),
      // passing the name and year as arguments.
      super(n, y);
      
      // Set passengers.
      passengers = p;
   }
   
   /**
      setPassengers method
      @param p The maximum number of passengers.
   */
   public void setPassengers(int p)
   {
      passengers = p;
   }
   
   /**
      getPassengers method
      @return The ship's maximum number of passengers.
   */
   public int getPassengers()
   {
      return passengers;
   }

   /**
      toString method
      @return A string indicating the ship's name
              and the maximum number of passengers.
   */
   public String toString()
   {
      return "Name: " + getName() + "\nMaximum passengers: " +
             passengers;
   }
}