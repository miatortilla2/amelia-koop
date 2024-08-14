import javax.swing.JOptionPane; // import JOptionPane

//Laminate Flooring Calculator - Java 3C
//Amelia Koop, Sp24

public class FlooringCalculator
{  
   public static void main(String[] args)
   {
      String input ; // get user input
      int numOfRooms ; // number of rooms needing flooring
      
      // ask user how many rooms to be floored
      input = JOptionPane.showInputDialog("How many rooms need flooring installed?") ;
      numOfRooms = Integer.parseInt(input) ;
      
      double totalSquareYds = 0 ; // set accumulator to 0
      
      // repeat program for amount of rooms the user requests
      for (int roomNum = 1; roomNum <= numOfRooms ; roomNum ++)
      {
         //ask room length
         double roomLength = Double.parseDouble(JOptionPane.showInputDialog("Please enter the length of the room: " + roomNum + " (in sq feet):"));
         
         //ask room width
         double roomWidth = Double.parseDouble(JOptionPane.showInputDialog("Please enter the width of the room: " + roomNum + " (in sq feet):"));
         
         double areaInFeet = roomLength * roomWidth ; // calculate area in feet
         double areaInYds = areaInFeet / 9 ; // convert area to yards
         
         totalSquareYds += areaInYds ; // add yards to total
         
         // print column headers
         System.out.println("ROOM\tLENGTH\tWIDTH\t\tSQ FT\t\tSQ YDS") ;
         
         // print room number, length, width, sq feet, and sq yards
         System.out.println(roomNum + "\t\t" + roomLength + "\t\t" + roomWidth + "\t\t" + areaInFeet + "\t\t" + areaInYds) ;
         
      }
      
      // set price per yard
      double pricePerYd = 23.85 ;
      
      System.out.println() ; // blank line
      System.out.println("\t\t TOTAL SQ YDS: " + totalSquareYds) ; // print total yards
      System.out.println("\t\t PRICE PER YD: $  " + pricePerYd) ; // print price per yard
      
      double totalCost = totalSquareYds * pricePerYd ; // calcuate total cost
      System.out.println("\t\t TOTAL COST: $  " + totalCost) ; // print total cost
      
      System.exit(0) ;
      
   }
}
