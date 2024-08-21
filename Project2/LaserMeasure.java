import java.util.Scanner;
   
   /**
 * Takes in a raw distance measurement in inches and then shows the
   the distance as a combination of miles, yards, feet, and inches for
   both short and long distances.
 *
 * @author Andrew Moon - COMP1210 - 006
 * @version 8/26/22
 */


public class LaserMeasure {
   /**
   * Converts an entered amount of inches to a combined amount of miles,
   yards, feet, and inches.
   *
   * @param args Command Line arguments (not used)
   */

   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      String name = "";
      int initialInches = 0;
      int initialInchesCopy = 0;
      int miles;
      int yards;
      int feet;
      int inches;
      
      System.out.print("Enter the raw distance measurement in inches: ");
      initialInches = userInput.nextInt();
      initialInchesCopy = initialInches;
      if (initialInches < 0) {
         System.out.println("Measurement must be non-negative!");
      }
      else {
         System.out.println();
         System.out.println("Measurement by combined miles, yards, "
            + "feet, inches:");
         miles = initialInches / 63360;
         initialInches = initialInches - (miles * 63360);
         yards = initialInches / 36;
         initialInches = initialInches - (yards * 36);
         feet = initialInches / 12;
         initialInches = initialInches - (feet * 12);
         inches = initialInches;
         System.out.println("\tmiles: " + miles);
         System.out.println("\tyards: " + yards);
         System.out.println("\tfeet: " + feet);
         System.out.println("\tinches: " + inches);
         System.out.println();
         System.out.println(initialInchesCopy + " in = " + miles + " mi, " 
            + yards + " yd, " + feet + " ft, " + inches + " in");
      }
   }
   
}
