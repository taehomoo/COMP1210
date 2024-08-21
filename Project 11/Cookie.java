/**
 * Creates the Cookie subclass an extension of BakedItem. This class edits
 the price method in BakedItem to Cookie objects price calculation.
 * Project 10
 * @author Andrew Moon - COMP1210 - 006
 * @version 11/3/22
 */

public class Cookie extends BakedItem {
/** base rate value for Cookie.*/
   public static final double BASE_RATE = 0.35;
   
   /**
   * constructor for Cookie.
   * @param nameIn parameter representing name
   * @param flavorIn parameter representing flavor
   * @param quantityIn parameter representing quantity
   * @param ingredientsIn parameter repesenting ingredients
   */
   public Cookie(String nameIn, String flavorIn, int quantityIn,
      String...ingredientsIn) {
      super(nameIn, flavorIn, quantityIn, ingredientsIn);   
   }
   
   /**
   * gets the price for the Cookie object.
   * @return BASE_RATE * quantity returns the price
   */
   public double price() {
      return BASE_RATE * quantity;
   }
}