import java.util.Scanner;

/**
 * Creates HexagonalPrism object and populates the object.
 *
 * @author Andrew Moon - COMP1210 - 006
 * @version 9/16/22
 */

public class HexagonalPrismApp {

/**
   * Creates a HexagonalPrism and prints out completed output.
   * @param args Command Line arguments (not used)
   */


   public static void main(String[] args) {
      double h;
      double e;
      String output = "";
      String label = "";
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter label, edge, and height for a hexagonal " 
         + "prism.");
      System.out.print("\t label: ");
      label = scan.nextLine();
      System.out.print("\t edge: ");
      e = scan.nextDouble();
      if (e <= 0) {
         System.out.println("Error: edge must be greater than zero.");
         return;
      }
      else {
         System.out.print("\t height: ");
         h = scan.nextDouble();
         if (h <= 0) {
            System.out.println("Error: height must be greater than zero.");
            return;
         }
         else {
            HexagonalPrism prism = new HexagonalPrism(label, e, h);
            output = prism.toString();
            System.out.println("\n" + output);
         }
      
      
      }
   
   }
}