import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Creates tests for methods of RingTorus.
 * Project 8
 * @author Andrew Moon - COMP1210 - 006
 * @version 10/15/22
 */

public class RingTorusTest {

/**
   * Creates tests for all methods in RingTorus.
   */



   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** tests getLabel method and also tests if setLabel correctly sets label
   in constructor.
   */
   @Test public void getLabelTest() {
      RingTorus rt = new RingTorus("ring", 5.0, 4.0);
      Assert.assertEquals("ring", rt.getLabel());
   }
   
   /** tests getLargeRadius and also tests if large radius is correctly set in
   constructor.
   */
   @Test public void getLargeRadiusTest() {
      RingTorus rt = new RingTorus("ring", 5.0, 4.0);
      Assert.assertEquals(5.0, rt.getLargeRadius(), .000001);
   }
   
   /** tests getSmallRadius and also tests if small radius is correctly set in
   constructor.
   */
   @Test public void getSmallRadiusTest() {
      RingTorus rt = new RingTorus("ring", 5.0, 4.0);
      Assert.assertEquals(4.0, rt.getSmallRadius(), .000001);
   }
   
   /** tests if diameter correctly calculates diameter.
   */
   @Test public void diameterTest() {
      RingTorus rt = new RingTorus("ring", 5.0, 4.0);
      Assert.assertEquals(2 * (5.0 + 4.0), rt.diameter(), .000001);
   }
   
   /** tests if surfaceArea correctly calculates surface area.
   */
   @Test public void surfaceAreaTest() {
      RingTorus rt = new RingTorus("ring", 5.0, 4.0);
      Assert.assertEquals((2 * Math.PI * 5.0) * (2 * Math.PI * 4.0),
         rt.surfaceArea(), .000001);
   }
   
   /** tests if volume method correctly calculates volume.
   */
   @Test public void volume() {
      RingTorus rt = new RingTorus("ring", 5.0, 4.0);
      Assert.assertEquals((2 * Math.PI * 5.0) * (Math.PI 
         * (4.0 * 4.0)), rt.volume(), .000001);
   }
   
   /** tests if toString is correct.
   */
   @Test public void toStringTest() {
      RingTorus rt = new RingTorus("ring", 5.0, 4.0);
      Assert.assertTrue(rt.toString().contains("\"ring\""));
   }
   
   /** tests if setLabel works.
   */
   @Test public void setLabelTestNotNull() {
      RingTorus rt = new RingTorus("ring", 5.0, 4.0);
      Assert.assertEquals("ring", rt.getLabel());
   }
   
   /** tests if label is null if false is returned. */
   @Test public void setLabelTestNull() {
      RingTorus rt = new RingTorus("ring", 5.0, 4.0);
      Assert.assertEquals(false, rt.setLabel(null));
   }
    
    /** tests if setLargeRadius works.
    */
   @Test public void setLargeRadiusTest() {
      RingTorus rt = new RingTorus("ring", 5.0, 4.0);
      Assert.assertEquals(5.0, rt.getLargeRadius(), .000001);
   }
   
   /** tests if setLargeRadius returns false if param less than 0.*/
   
   @Test public void setLargeRadiusFalseTest1() {
      RingTorus rt = new RingTorus("ring", 5.0, 4.0);
      Assert.assertEquals(false, rt.setLargeRadius(-1.0));
   }
   
   /** tests if setLargeRadius returns false if param less than smallR.*/
   @Test public void setLargeRadiusFalseTest2() {
      RingTorus rt = new RingTorus("ring", 5.0, 4.0);
      Assert.assertEquals(false, rt.setLargeRadius(3.0));
   }
    
    /** tests if setSmallRadius works.
    */
   @Test public void setSmallRadiusTest() {
      RingTorus rt = new RingTorus("ring", 5.0, 4.0);
      Assert.assertEquals(4.0, rt.getSmallRadius(), .000001);
   }
   
   /** tests if setSmallRadius returns false if param is less than 0.*/
   
   @Test public void setSmallRadiusFalseTest1() {
      RingTorus rt = new RingTorus("ring", 5.0, 4.0);
      Assert.assertEquals(false, rt.setSmallRadius(-1.0));
   }
   
   /** tests if setSmallRadius returns false if param is greater than largeR.*/
   @Test public void setSmallRadiusFalseTest2() {
      RingTorus rt = new RingTorus("ring", 5.0, 4.0);
      Assert.assertEquals(false, rt.setSmallRadius(6.0));
   }
    
    /** tests if getCount works.
    */
   @Test public void getCountTest() {
      RingTorus.resetCount();
      RingTorus rt = new RingTorus("ring", 5.0, 4.0);
      Assert.assertEquals(1, RingTorus.getCount());
   }
    
    /** tests if resetCount works.
    */
   @Test public void resetCountTest() {
      RingTorus rt = new RingTorus("ring", 5.0, 4.0);
      RingTorus.resetCount();
      Assert.assertEquals(0, RingTorus.getCount());
   }
    
    /** tests if equals works.
    */
   @Test public void equalsTest() {
      RingTorus rt = new RingTorus("ring", 5.0, 4.0);
      RingTorus rt2 = new RingTorus("ring2", 5.0, 4.0);
      Assert.assertEquals(false, rt.equals(rt2));
   }
   
   /** tests equals method if object is not instance of RingTorus.*/
   
   @Test public void equalsTestFailInstance() {
      RingTorus rt = new RingTorus("ring", 5.0, 4.0);
      String test = "test";
      Assert.assertEquals(false, rt.equals(test));
   }
   
   /** tests equals method if first condition is false.*/
   @Test public void equalsTestFXX() {
      RingTorus rt = new RingTorus("ring", 5.0, 4.0);
      RingTorus rt2 = new RingTorus("ring2", 5.0, 4.0);
      Assert.assertEquals(false, rt.equals(rt2));
   }
   
   /** tests equals method if second condition is false.*/
   @Test public void equalsTestTFX() {
      RingTorus rt = new RingTorus("ring", 5.0, 4.0);
      RingTorus rt2 = new RingTorus("ring", 6.0, 4.0);
      Assert.assertEquals(false, rt.equals(rt2));
   }
   
   /** tests equals method if third condition is false.*/
   @Test public void equalsTestTTF() {
      RingTorus rt = new RingTorus("ring", 5.0, 4.0);
      RingTorus rt2 = new RingTorus("ring", 5.0, 5.0);
      Assert.assertEquals(false, rt.equals(rt2));
   }
   
   /** tests equals method if all conditions are true.*/
   @Test public void equalsTestTTT() {
      RingTorus rt = new RingTorus("ring", 5.0, 4.0);
      RingTorus rt2 = new RingTorus("ring", 5.0, 4.0);
      Assert.assertEquals(true, rt.equals(rt2));
   }
    
    /** tests if hashCode works.
    */
   @Test public void hashCodeTest() {
      RingTorus rt = new RingTorus("ring", 5.0, 4.0);
      Assert.assertEquals(0, rt.hashCode());
   }
   
   /** tests compareTo method for negative return.*/
   @Test public void compareToTestNegative() {
      RingTorus rt = new RingTorus("ring", 5.0, 4.0);
      RingTorus rt2 = new RingTorus("ring", 7.0, 6.0);
      Assert.assertEquals(-1, rt.compareTo(rt2));
   }
   
   /** tests compareTo method for positive return.*/
   @Test public void compareToTestPositive() {
      RingTorus rt = new RingTorus("ring", 5.0, 4.0);
      RingTorus rt2 = new RingTorus("ring", 3.0, 2.0);
      Assert.assertEquals(1, rt.compareTo(rt2));
   }
   
   /** tests compareTo method for 0 return.*/
   @Test public void compareToTestZero() {
      RingTorus rt = new RingTorus("ring", 5.0, 4.0);
      RingTorus rt2 = new RingTorus("ring", 5.0, 4.0);
      Assert.assertEquals(0, rt.compareTo(rt2));
   }
}
