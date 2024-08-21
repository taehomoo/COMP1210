import java.util.Scanner;

/**
 * Inputs values of type double for x, y, and z and solves for the result of
   the indicated formula when z is not zero.
 *
 * @author Andrew Moon - COMP1210 - 006
 * @version 8/26/22
 */

public class MySolver {
   /**
   * Scans in values for x, y, and z, and calculates the indicated formula
   with given values.
   *
   * @param args Command Line arguments (not used)
   */
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      double x = 0;
      double y = 0;
      double z = 0;
      double result = 0;
      
      System.out.println("result = (8.5x + 6.1) (10y + 7.9) / z");
      System.out.print("\tEnter x: ");
      x = userInput.nextDouble();
      System.out.print("\tEnter y: ");
      y = userInput.nextDouble();
      System.out.print("\tEnter z: ");
      z = userInput.nextDouble();
      if (z == 0) {
         System.out.println("result is undefined");
      }
      else {
         result = (((8.5 * x) + 6.1) * ((10 * y) + 7.9)) / z;
         System.out.println("result = " + result);
      }
   }
}
