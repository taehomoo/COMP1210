import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

 /**
 * Creates tests for methods of WeddingCake.
 * Project 9
 * @author Andrew Moon - COMP1210 - 006
 * @version 11/4/22
 */

public class WeddingCakeTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** tests method getTiers. **/
   @Test public void getTiersTest() {
      WeddingCake wc = new WeddingCake("cake", "chocolate", 12, 3, 4, "sugar");
      Assert.assertEquals(wc.getTiers(), 4);
   }
   
   /**tests method setTiers. */
   @Test public void setTiersTest() {
      WeddingCake wc = new WeddingCake("cake", "chocolate", 12, 3, 4, "sugar");
      wc.setTiers(1);
      Assert.assertEquals(wc.getTiers(), 1);
   }
    
    /** tests method price in WeddingCake class.*/
   @Test public void weddingCakePriceTest() {
      WeddingCake wc = new WeddingCake("cake", "chocolate", 12, 3, 4, "sugar");
      Assert.assertEquals(wc.price(), 2160, .000001);
   }
}
