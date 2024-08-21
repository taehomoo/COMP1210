/**
 * Creates the Cake subclass, an extension of BakedItem. This class adds
 a variable layers and edits the price method.
 * Project 10
 * @author Andrew Moon - COMP1210 - 006
 * @version 11/3/22
 */

public class Cake extends BakedItem {
   protected int layers;
   /** base rate value for Cake.*/
   public static final double BASE_RATE = 8;
   
   /**
   * constructor for Cake object.
   * @param nameIn parameter representing name
   * @param flavorIn parameter representing flavor
   * @param quantityIn parameter representing quantity
   * @param layersIn parameter representing the number of layers
   * @param ingredientsIn parameter representing ingredients list
   */

   public Cake(String nameIn, String flavorIn, int quantityIn, int layersIn,
      String...ingredientsIn) {
      super(nameIn, flavorIn, quantityIn, ingredientsIn);
      layers = layersIn;  
   }
   
   /**
   * gets number of layers in cake object.
   * @return layers returns layers value
   */
   public int getLayers() {
      return layers;
   }
   
   /**
   * sets number of layers in cake object.
   * @param layersIn int value to be set to layers
   */
   public void setLayers(int layersIn) {
      layers = layersIn;
   }
   
   /**
   * calculates price of cake object(s).
   * @return (BASE_RATE * layers) * quantity returns calculation of price
   */
   public double price() {
      return (BASE_RATE * layers) * quantity;
   }
}