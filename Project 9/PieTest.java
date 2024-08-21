import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

 /**
 * Creates tests for methods of Pie.
 * Project 9
 * @author Andrew Moon - COMP1210 - 006
 * @version 11/4/22
 */

public class PieTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** tests method getCrustCost. **/
   @Test public void getCrustCostTest() {
      Pie p = new Pie("Pie", "Apple", 12, 1.5, "Apples", "Sugar", "Dough");
      Assert.assertEquals(p.getCrustCost(), 1.5, .000001);
   }
   
   /** tests method setCrustCost. */
   @Test public void setCrustCostTest() {
      Pie p = new Pie("Pie", "Apple", 12, 1.5, "Apples", "Sugar", "Dough");
      p.setCrustCost(2.0);
      Assert.assertEquals(p.getCrustCost(), 2.0, .000001);
   }
   
   /** tests method price in Pie Class.*/
   @Test public void piePriceTest() {
      Pie p = new Pie("Pie", "Apple", 12, 1.5, "Apples", "Sugar", "Dough");
      Assert.assertEquals(162, p.price(), .000001);
   }
}
