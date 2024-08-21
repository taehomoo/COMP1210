import java.util.Comparator;

/**
 * Creates the class FlavorComparator with it's included methods.
 * Project 10
 * @author Andrew Moon - COMP1210 - 006
 * @version 11/11/22
 */

public class FlavorComparator implements Comparator<BakedItem> {
/**
* compares the lexographic order between b1 and b2.
* @param b1 first bakeditem to be compared
* @param b2 second bakeditem to be compared
* @return -1 if b1 is less than b2
*/
   public int compare(BakedItem b1, BakedItem b2) {
      String example1 = b1.getFlavor().toLowerCase();
      String example2 = b2.getFlavor().toLowerCase();
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