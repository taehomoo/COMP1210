import java.util.Comparator;

/**
 * Creates the class PriceComparator with it's included methods.
 * Project 10
 * @author Andrew Moon - COMP1210 - 006
 * @version 11/11/22
 */

public class PriceComparator implements Comparator<BakedItem> {
/**
* compares the price of the two bakeditems.
* @param b1 first bakedItem
* @param b2 second bakeditem
* @return -1 if b1 < b2
*/ 
   public int compare(BakedItem b1, BakedItem b2) {
      if (b1.price() < b2.price()) {
         return -1;
      }
      else if (b1.price() > b2.price()) {
         return 1;
      }
      else {
         return 0;
      }
   }
}