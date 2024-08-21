import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * Solves for the result in the expression given with an
 inputted double value for x, then provides the # of digits to the left
 and to the right and outputs the formatted result.
 *
 * @author Andrew Moon - COMP1210 - 006
 * @version 9/8/22
 */
public class RadicalFormula {
   /**
   *Solves the given formula with an inputted value for x, and also
   details # of digits to right and left of decimal, and formats result.
   *
   * @param args Command Line arguments (not used)
   */
   public static void main(String[] args) {
      double x;
      double result;
      double insideRoot1;
      double insideRoot2;
      String resultString = "";
      int decimalIndex;
      int rightNum;
      DecimalFormat decimalFormat = new DecimalFormat("#,##0.0##");
      
      Scanner userInput = new Scanner(System.in);
      System.out.print("Enter a value for x: ");
      x = userInput.nextDouble();
      insideRoot1 = Math.pow((3 * Math.pow(x, 8)) - (2 * Math.pow(x, 3)), 2);
      insideRoot2 = Math.abs((3 * Math.pow(x, 5)) - (2 * Math.pow(x, 3)));
      result = Math.sqrt(insideRoot1 + insideRoot2);
      System.out.println("Result: " + result);
      resultString = Double.toString(result);
      decimalIndex = resultString.indexOf(".");
      System.out.println("# digits to left of decimal point: " 
         + decimalIndex);
      rightNum = resultString.length() - decimalIndex - 1;
      System.out.println("# digits to right of decimal point: "
         + rightNum);
      System.out.println("Formatted Result: " + decimalFormat.format(result));
   }

}