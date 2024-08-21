/**
 * Creates the WeddingCake subclass an extension of Cake. This subclass
 adds a variable layers and edits the price method.
 * Project 10
 * @author Andrew Moon - COMP1210 - 006
 * @version 11/3/22
 */
public class WeddingCake extends Cake {
   private int tiers;
   /** base rate value for WeddingCake.*/
   public static final double BASE_RATE = 15.0;
   
   /**
   * constructor for Pie object.
   * @param nameIn parameter representing name
   * @param flavorIn parameter representing flavor
   * @param quantityIn parameter representing quantity
   * @param layersIn parameter representing the number of layers
   * @param tiersIn parameter representing number of tiers
   * @param ingredientsIn parameter representing ingredients list
   */

   public WeddingCake(String nameIn, String flavorIn, int quantityIn,
      int layersIn, int tiersIn, String...ingredientsIn) {
      super(nameIn, flavorIn, quantityIn, layersIn, ingredientsIn);
      tiers = tiersIn;      
   }
   
   /**
   * gets the amount of tiers the cake has.
   * @return tiers returns number of tiers
   */
   public int getTiers() {
      return tiers;
   }
   
   /**
   * sets the amount of tiers the cake has.
   * @param tiersIn int parameter representing number of tiers
   */
   public void setTiers(int tiersIn) {
      tiers = tiersIn;
   }
   
   /**
   * returns price of WeddingCake object.
   * @return (BASE_RATE * layers * tiers) * quantity returns calculation of 
   price
   */
   public double price() {
      return (BASE_RATE * layers * tiers) * quantity;
   }
}