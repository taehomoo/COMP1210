import java.text.DecimalFormat;

/**
 * Creates the class BakedItem with it's included methods. This class
 creates a BakedItem object, offers to set or get included properties of the
 object, and provides a toString method. Also defines the natural
 ordering of a BakedItem object.
 * Project 10
 * @author Andrew Moon - COMP1210 - 006
 * @version 11/2/22
 */
public abstract class BakedItem implements Comparable<BakedItem> {
   protected String name;
   protected String flavor;
   protected int quantity;
   protected String[] ingredients;
   protected static int count = 0;
   
   /**
   * constructor for BakedItem.
   * @param nameIn string that will be assigned to variable name
   * @param flavorIn string that will be assigned to variable flavor
   * @param quantityIn int value that will be assigned to variable quantity
   * @param ingredientsIn array parameter that will be assigned to ingredients
   */
   public BakedItem(String nameIn, String flavorIn, int quantityIn,
      String...ingredientsIn) {
      name = nameIn;
      flavor = flavorIn;
      quantity = quantityIn;
      ingredients = ingredientsIn;
      count++;
   }
   
   /**
   * gets the name of this BakedItem.
   * @return name returns the name
   */
   public String getName() {
      return name;
   }
   
   /**
   * sets the name of this BakedItem.
   * @param nameIn parameter representing new name
   */
   public void setName(String nameIn) {
      name = nameIn;
   }
   
   /**
   * gets the flavor of this BakedItem.
   * @return flavor returns the flavor
   */
   public String getFlavor() {
      return flavor;
   }
   
   /**
   * sets the flavor of this BakedItem.
   * @param flavorIn parameter representing flavor
   */
   public void setFlavor(String flavorIn) {
      flavor = flavorIn;
   }
   
   /**
   * gets the quantity.
   * @return quantity returns the quantity
   */
   public int getQuantity() {
      return quantity;
   }
   
   /**
   * sets the quantity.
   * @param quantityIn parameter representing quantity
   */
   public void setQuantity(int quantityIn) {
      quantity = quantityIn;
   }
   
   /**
   * gets the ingredients of this BakedItem.
   * @return ingredients returns ingredients
   */
   public String[] getIngredients() {
      return ingredients;
   }
   
   /**
   * sets the ingredients of this BakedItem.
   * @param ingredientsIn parameter representing ingredients
   */
   public void setIngredients(String...ingredientsIn) {
      ingredients = ingredientsIn;
   }
   
   /**
   * returns an int representing the count.
   * @return count returns count
   */
   public static int getCount() {
      return count;
   }
   
   /**
   * resets count to zero.
   */
   public static void resetCount() {
      count = 0;
   }
   
   /**
   * returns String describing BakedItem object.
   * @return output returns result String.
   */
   public final String toString() {
      DecimalFormat df = new DecimalFormat("$#,##0.00");
      String output = "" + this.getClass().toString().substring(6) + ": "
         + getName() + " - " + getFlavor() + "   Quantity: " + getQuantity()
         + "   Price: " + df.format(price()) + "\n(Ingredients: ";
      for (int i = 0; i < ingredients.length; i++) {
         if (i % 5 == 0 && i != 0) {
            if (i == ingredients.length - 1) {
               output += "\n" + ingredients[i] + ")";
               break;
            }
            else {
               output += "\n";
               output += ingredients[i] + ", ";
            }
         }
         
         else if (i == ingredients.length - 1) {
            output += ingredients[i] + ")";
         }
         else {
            output += ingredients[i] + ", ";
         }
      }
      return output;
   }
   
   /**
   * returns price of the BakedItem.
   * @return abstract methodx
   */
   public abstract double price();
   
   /**
   * compares BakedItem to sort ordering.
   * @param bI BakedItem passed in to compare.
   * @return -1 if this example1 < example2.
   */
   public int compareTo(BakedItem bI) {
      String example1 = this.toString().toLowerCase();
      String example2 = bI.toString().toLowerCase();
      if (example1.compareTo(example2) < 0) {
         return -1;
      }
      else if (example1.compareTo(example2) > 0) {
         return 1;
      }
      else {
         return 0;
      }
   }
}