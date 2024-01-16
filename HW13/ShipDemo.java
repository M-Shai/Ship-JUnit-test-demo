/**
   This program demonstrates a solution to the
   Ship, CruiseShip, and CargoShip Classes 
   programming challenge.
*/

public class ShipDemo
{
   public static void main(String[] args)
   {
      // Constant for the number of ships.
      final int NUM_SHIPS = 3;
      
      // Create an array of Ship references.
      Ship[] ships = new Ship[NUM_SHIPS];
      
      // Assign Ship objects to the array elements.
      ships[0] = new Ship("Lolipop", "1960");
      ships[1] = new CruiseShip("Disney Magic", "1998", 2400);
      ships[2] = new CargoShip("Black Pearl", "1800", 50000);
      
      // Call each object's toString method.
      for (int index = 0; index < 3; index++)
      {
         System.out.println(ships[index]);
         System.out.println("----------------------------");
      }
   }
}