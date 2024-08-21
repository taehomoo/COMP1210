import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Creates tests for methods of RingTorusList.
 * Project 8
 * @author Andrew Moon - COMP1210 - 006
 * @version 10/28/22
 */

public class RingTorusListTest {

   /**
   * Creates tests for methods in RingTorusList.
   */

   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /** tests getName method.*/
   @Test public void getNameTest() {
      RingTorus[] list = new RingTorus[5];
      list[0] = new RingTorus("ring", 5.0, 4.0);
      list[1] = new RingTorus("ring", 6.0, 3.0);
      RingTorusList rtl = new RingTorusList("list", list, 2);
      Assert.assertEquals("list", rtl.getName());
   }
   
   /** tests numberOfRingToruses method.*/
   @Test public void numberOfRingTorusesTest() {
      RingTorus[] list = new RingTorus[5];
      list[0] = new RingTorus("ring", 5.0, 4.0);
      list[1] = new RingTorus("ring", 6.0, 3.0);
      RingTorusList rtl = new RingTorusList("list", list, 2);
      Assert.assertEquals(2, rtl.numberOfRingToruses());
   }
   
   /** tests totalDiameter method.*/
   @Test public void totalDiameterTest() {
      RingTorus[] list = new RingTorus[5];
      list[0] = new RingTorus("ring", 5.0, 4.0);
      list[1] = new RingTorus("ring", 6.0, 3.0);
      RingTorusList rtl = new RingTorusList("list", list, 2);
      Assert.assertEquals(list[0].diameter() + list[1].diameter(),
            rtl.totalDiameter(), 0.000001);
   }
   
   /** tests totalDiameter method if no objects in array.*/
   @Test public void totalDiameterTest2() {
      RingTorus[] list = new RingTorus[5];
      RingTorusList rtl = new RingTorusList("list", list, 0);
      Assert.assertEquals(0, rtl.totalDiameter(), 0.000001);
   }
   
   /** tests totalSurfaceArea method.*/
   @Test public void totalSurfaceAreaTest() {
      RingTorus[] list = new RingTorus[5];
      list[0] = new RingTorus("ring", 5.0, 4.0);
      list[1] = new RingTorus("ring", 6.0, 3.0);
      RingTorusList rtl = new RingTorusList("list", list, 2);
      Assert.assertEquals(list[0].surfaceArea() + list[1].surfaceArea(),
         rtl.totalSurfaceArea(), 0.000001);
   }
   
   /** tests totalSurfaceArea method if no objects in array.*/
   @Test public void totalSurfaceAreaTest2() {
      RingTorus[] list = new RingTorus[5];
      RingTorusList rtl = new RingTorusList("list", list, 0);
      Assert.assertEquals(0, rtl.totalSurfaceArea(), 0.000001);
   }
   
   /** tests totalVolume method.*/
   @Test public void totalVolumeTest() {
      RingTorus[] list = new RingTorus[5];
      list[0] = new RingTorus("ring", 5.0, 4.0);
      list[1] = new RingTorus("ring", 6.0, 3.0);
      RingTorusList rtl = new RingTorusList("list", list, 2);
      Assert.assertEquals(list[0].volume() + list[1].volume(),
         rtl.totalVolume(), 0.000001);
   }
   
   /** tests totalVolume method if no objects in array.*/
   @Test public void totalVolumeTest2() {
      RingTorus[] list = new RingTorus[5];
      RingTorusList rtl = new RingTorusList("list", list, 0);
      Assert.assertEquals(0, rtl.totalVolume(), 0.000001);
   }
   
   /** tests averageDiameter method.*/
   @Test public void averageDiameterTest() {
      RingTorus[] list = new RingTorus[5];
      list[0] = new RingTorus("ring", 5.0, 4.0);
      list[1] = new RingTorus("ring", 6.0, 3.0);
      RingTorusList rtl = new RingTorusList("list", list, 2);
      Assert.assertEquals((list[0].diameter() + list[1].diameter()) / 2,
         rtl.averageDiameter(), 0.000001);
   }
   
   /** tests averageDiameter method if no objects in array.*/
   @Test public void averageDiameterTest2() {
      RingTorus[] list = new RingTorus[5];
      RingTorusList rtl = new RingTorusList("list", list, 0);
      Assert.assertEquals(0, rtl.averageDiameter(), 0.000001);
   
   }
   
   /** tests averageSurfaceArea method.*/
   @Test public void averageSurfaceAreaTest() {
      RingTorus[] list = new RingTorus[5];
      list[0] = new RingTorus("ring", 5.0, 4.0);
      list[1] = new RingTorus("ring", 6.0, 3.0);
      RingTorusList rtl = new RingTorusList("list", list, 2);
      Assert.assertEquals((list[0].surfaceArea() + list[1].surfaceArea()) / 2,
         rtl.averageSurfaceArea(), 0.000001);
   }
   
   /** tests averageSurfaceArea method if no objects in array.*/
   @Test public void averageSurfaceAreaTest2() {
      RingTorus[] list = new RingTorus[5];
      RingTorusList rtl = new RingTorusList("list", list, 0);
      Assert.assertEquals(0, rtl.averageSurfaceArea(), 0.000001);
   
   }
   
   /** tests averageVolume method.*/
   @Test public void averageVolumeTest() {
      RingTorus[] list = new RingTorus[5];
      list[0] = new RingTorus("ring", 5.0, 4.0);
      list[1] = new RingTorus("ring", 6.0, 3.0);
      RingTorusList rtl = new RingTorusList("list", list, 2);
      Assert.assertEquals((list[0].volume() + list[1].volume()) / 2,
         rtl.averageVolume(), 0.000001);
   }
   
   /** tests averageVolume method if no objects in array.*/
   @Test public void averageVolumeTest2() {
      RingTorus[] list = new RingTorus[5];
      RingTorusList rtl = new RingTorusList("list", list, 0);
      Assert.assertEquals(0, rtl.averageVolume(), 0.000001);
   }
   
   /** tests toString method.*/
   @Test public void toStringTest() {
      RingTorus[] list = new RingTorus[5];
      list[0] = new RingTorus("ring", 5.0, 4.0);
      list[1] = new RingTorus("ring", 6.0, 3.0);
      RingTorusList rtl = new RingTorusList("ListName", list, 2);
      Assert.assertTrue(rtl.toString("ListName").contains("ListName"));
   }
   
   /** tests getList method.*/
   @Test public void getListTest() {
      RingTorus[] list = new RingTorus[5];
      list[0] = new RingTorus("ring", 5.0, 4.0);
      list[1] = new RingTorus("ring", 6.0, 3.0);
      RingTorusList rtl = new RingTorusList("list", list, 2);
      Assert.assertArrayEquals(list, rtl.getList());
   }
   
   /** tests addRingTorus method.*/
   @Test public void addRingTorusTest() {
      RingTorus[] list = new RingTorus[5];
      list[0] = new RingTorus("ring", 5.0, 4.0);
      list[1] = new RingTorus("ring", 6.0, 3.0);
      RingTorusList rtl = new RingTorusList("list", list, 2);
      rtl.addRingTorus("ring", 7.0, 2.0);
      Assert.assertEquals(3, rtl.numberOfRingToruses());
   }
   
   /** tests findRingTorus method.*/
   @Test public void findRingTorusTest() {
      RingTorus[] list = new RingTorus[5];
      list[0] = new RingTorus("ring", 5.0, 4.0);
      list[1] = new RingTorus("ring2", 6.0, 3.0);
      RingTorusList rtl = new RingTorusList("list", list, 2);
      Assert.assertEquals(list[1], rtl.findRingTorus("ring2"));
   }
   
   /** tests findRingTorus method if RingTorus is not found.*/
   @Test public void findRingTorusTest2() {
      RingTorus[] list = new RingTorus[5];
      list[0] = new RingTorus("ring", 5.0, 4.0);
      list[1] = new RingTorus("ring", 6.0, 3.0);
      RingTorusList rtl = new RingTorusList("list", list, 2);
      Assert.assertEquals(null, rtl.findRingTorus("no"));
   }
   
   /** tests deleteRingTorus method.*/
   @Test public void deleteRingTorusTest() {
      RingTorus[] list = new RingTorus[5];
      list[0] = new RingTorus("ring", 5.0, 4.0);
      list[1] = new RingTorus("ring1", 6.0, 3.0);
      RingTorusList rtl = new RingTorusList("list", list, 2);
      Assert.assertEquals(list[0], rtl.deleteRingTorus("ring"));
   }
   
   /** tests deleteRingTorus method if RingTorus not found.*/
   @Test public void deleteRingTorusTest2() {
      RingTorus[] list = new RingTorus[5];
      list[0] = new RingTorus("ring", 5.0, 4.0);
      list[1] = new RingTorus("ring", 6.0, 3.0);
      RingTorusList rtl = new RingTorusList("list", list, 2);
      Assert.assertEquals(null, rtl.deleteRingTorus("false"));
   }
   
   /** tests editRingTorus method.*/
   @Test public void editRingTorusTest() {
      RingTorus[] list = new RingTorus[5];
      list[0] = new RingTorus("ring", 5.0, 4.0);
      list[1] = new RingTorus("ring1", 6.0, 3.0);
      RingTorusList rtl = new RingTorusList("list", list, 2);
      Assert.assertEquals(true, rtl.editRingTorus("ring", 7.0, 2.0));
   }
   
   /** tests editRingTorus method if RingTorus not found.*/
   @Test public void editRingTorusTest2() {
      RingTorus[] list = new RingTorus[5];
      list[0] = new RingTorus("ring", 5.0, 4.0);
      list[1] = new RingTorus("ring", 6.0, 3.0);
      RingTorusList rtl = new RingTorusList("list", list, 2);
      Assert.assertEquals(false, rtl.editRingTorus("false", 7.0, 2.0));
   }
   
   /** tests findRingTorusWithLargestVolume method.*/
   @Test public void findRingTorusWithLargestVolume() {
      RingTorus[] list = new RingTorus[5];
      list[0] = new RingTorus("ring", 5.0, 4.0);
      list[1] = new RingTorus("ring", 10.0, 8.0);
      RingTorusList rtl = new RingTorusList("list", list, 2);
      Assert.assertEquals(list[1], rtl.findRingTorusWithLargestVolume());
   }
   
   /** tests findRingTorusWithLargestVolume method if no objects in array.*/
   @Test public void findRingTorusWithLargestVolume2() {
      RingTorus[] list = new RingTorus[5];
      RingTorusList rtl = new RingTorusList("list", list, 0);
      Assert.assertEquals(null, rtl.findRingTorusWithLargestVolume());
   }
}
