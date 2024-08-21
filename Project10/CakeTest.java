import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Creates tests for methods of Cake.
 * Project 9
 * @author Andrew Moon - COMP1210 - 006
 * @version 11/4/22
 */

public class CakeTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** tests method getLayers. **/
   @Test public void getLayersTest() {
      Cake c = new Cake("Cake", "Chocolate", 12, 3, "Strawberries", "Sugar");
      Assert.assertEquals(c.getLayers(), 3);
   }
   
   /** tests method setLayers. */
   @Test public void setLayersTest() {
      Cake c = new Cake("Cake", "Chocolate", 12, 3, "Strawberries", "Sugar");
      c.setLayers(2);
      Assert.assertEquals(c.getLayers(), 2);
   }
    
    /** tests method price in Cake Class.*/
   @Test public void cakePriceTest() {
      Cake c = new Cake("Cake", "Chocolate", 12, 3, "Strawberries", "Sugar");
      Assert.assertEquals(288, c.price(), .000001);
   }
}
