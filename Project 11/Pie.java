/**
 * Creates the Pie subclass an extension of BakedItem. This subclass adds
 a variable crustCost and edits the price method.
 * Project 10
 * @author Andrew Moon - COMP1210 - 006
 * @version 11/3/22
 */

public class Pie extends BakedItem {
   private double crustCost;
   /** base rate value for Pie.*/
   public static final double BASE_RATE = 12.0;
   
   /**
   * constructor for Pie object.
   * @param nameIn parameter representing name
   * @param flavorIn parameter representing flavor
   * @param quantityIn parameter representing quantity
   * @param crustCostIn parameter representing the crust cost
   * @param ingredientsIn parameter representing ingredients list
   */
   public Pie(String nameIn, String flavorIn, int quantityIn,
      double crustCostIn, String...ingredientsIn) {
      super(nameIn, flavorIn, quantityIn, ingredientsIn);
      crustCost = crustCostIn;
   }
   
   /**
   * method gets cost of crust.
   * @return crustCost returns the cost of crust
   */
   public double getCrustCost() {
      return crustCost;
   }
   
   /**
   * method sets the cost of crust.
   * @param crustCostIn double value representing cost of crust
   */
   public void setCrustCost(double crustCostIn) {
      crustCost = crustCostIn;
   }
   
   /**
   * method gets price of Pie object.
   * @return (BASE_RATE + crustCost) * quantity returns price calculation
   */
   public double price() {
      return (BASE_RATE + crustCost) * quantity;
   }
}