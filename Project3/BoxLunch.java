import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;

/**
 * Takes in an order number with a name, and obtains the amount of adult 
 and child orders, the prices, and theme from that number. Then outputs all 
 that information, plus the total cost and a lucky number ranging from 1-1000.
 *
 * @author Andrew Moon - COMP1210 - 006
 * @version 9/8/22
 */

public class BoxLunch {

/**
   * Scans in the order, uses substrings to separate different parts of the 
   order.Changes substringsinto integers and doubles as needed, outputs answers
   in needed format style. Takes first number to indicate what kind of party, 
   and uses a random number generator to generate a lucky number.
   * @param args Command Line arguments (not used)
   */


   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      DecimalFormat mealFormat = new DecimalFormat("$#,##0.00");
      DecimalFormat numberFormat = new DecimalFormat("0000");
      Random luckyRandom = new Random();
      String order = "";
      String name = "";
      int adultMeals;
      int childMeals;
      double adultCost;
      double childCost;
      double totalCost;
      int theme;
      int lucky;
     
      
      
      System.out.print("Enter order code: ");
      order = userInput.nextLine();
      order = order.trim();
      System.out.println();
      if (order.length() < 13) {
         System.out.println("*** Invalid Order Code ***");
         System.out.println("Order code must have at least 13 characters.");
      }
      else {
         name = order.substring(13);
         adultMeals = Integer.parseInt(order.substring(1, 3));
         //System.out.print(adultMeals);
         childMeals = Integer.parseInt(order.substring(7, 9));
         adultCost = Double.parseDouble(order.substring(3, 7)) / 100;
         childCost = Double.parseDouble(order.substring(9, 13)) / 100;
         totalCost = (adultMeals * adultCost) + (childMeals * childCost);
         theme = Integer.parseInt(order.substring(0, 1));
         
         System.out.println("Name: " + name);
         System.out.println("Adult meals: " + adultMeals + " at " 
            + mealFormat.format(adultCost));
         System.out.println("Child meals: " + childMeals + " at "
            + mealFormat.format(childCost));
         System.out.println("Total: " + mealFormat.format(totalCost));
         if (theme == 0) {
            System.out.println("Theme: Birthday");
         }
         else if (theme == 1) {
            System.out.println("Theme: Graduation");
         }
         else {
            System.out.println("Theme: Holiday");
         }
         lucky = luckyRandom.nextInt(9999) + 1;
         System.out.println("Lucky Number: " + numberFormat.format(lucky));
      }
   }

}