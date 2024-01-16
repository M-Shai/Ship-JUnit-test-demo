/**
   The Ship class stores data about a ship for the
   Ship, CruiseShip, and CargoShip Classes 
   programming challenge.
*/

public class Ship
{
   private String name;         // Ship name
   private String yearBuilt;    // Year it was built
   
   /**
      Constructor
      @param n The ship's name.
      @param y The year the ship was build.
   */
   public Ship(String n, String y)
   {
      name = n;
      yearBuilt = y;
   }
   
   /**
      setName method 
      @param n The ship's name.
   */
   public void setName(String n)
   {
      name = n;
   }

   /**
      setYearBuilt method 
      @param y The year the ship was built.
   */
   public void setYearBuilt(String y)
   {
      yearBuilt = y;
   }


   /**
      getName method 
      @return The ship's name.
   */
   public String getName()
   {
      return name;
   }

   /**
      getYearBuilt method
      @return The year the ship was built.
   */
   public String getYearBuilt()
   { 
      return yearBuilt;
   }
   
   /**
      toString method
      @return A string indicating the ship's name
              and the year it was built.
   */
   public String toString()
   {
      return "Name: " + name + "\nYear built: " +
             yearBuilt;
   }
}