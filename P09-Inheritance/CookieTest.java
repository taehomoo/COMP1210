import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Creates tests for methods of BakedItem and Cookie classes.
 * Project 9
 * @author Andrew Moon - COMP1210 - 006
 * @version 11/3/22
 */


public class CookieTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** Tests getName method in BakedItem.*/
   @Test public void getNameTest() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, "flour",
         "sugar", "dark chocolate chips", "butter", "baking soda", "salt");
      Assert.assertEquals(c.getName(), "Chips Delight");
   }
   
   /** Tests setName method in BakedItem.*/
   @Test public void setNameTest() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, "flour",
         "sugar", "dark chocolate chips", "butter", "baking soda", "salt");
      c.setName("Cookie");
      Assert.assertEquals(c.getName(), "Cookie");
   }
   
   /** tests method getFlavor.*/
   @Test public void getFlavorTest() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, "flour",
         "sugar", "dark chocolate chips", "butter", "baking soda", "salt");
      Assert.assertEquals(c.getFlavor(), "Chocolate Chip");
   }
   
   /** tests method setFlavor.*/
   @Test public void setFlavorTest() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, "flour",
         "sugar", "dark chocolate chips", "butter", "baking soda", "salt");
      c.setFlavor("Vanilla");
      Assert.assertEquals(c.getFlavor(), "Vanilla");
   }
   
   /** tests method getQuantity.*/
   @Test public void getQuantityTest() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, "flour",
         "sugar", "dark chocolate chips", "butter", "baking soda", "salt");
      Assert.assertEquals(c.getQuantity(), 12);
   }
   
   /** tests method setQuantity.*/
   @Test public void setQuantityTest() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, "flour",
         "sugar", "dark chocolate chips", "butter", "baking soda", "salt");
      c.setQuantity(15);
      Assert.assertEquals(c.getQuantity(), 15);
   }
   
   /** tests method getIngredients.*/
   @Test public void getIngredientsTest() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, "flour",
         "sugar", "dark chocolate chips", "butter", "baking soda", "salt");
      String[] ingredients = new String[6];
      ingredients[0] = "flour";
      ingredients[1] = "sugar";
      ingredients[2] = "dark chocolate chips";
      ingredients[3] = "butter";
      ingredients[4] = "baking soda";
      ingredients[5] = "salt";
      Assert.assertArrayEquals(ingredients, c.getIngredients());
   }
   
   /** tests method setIngredients.*/
   @Test public void setIngredientsTest() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, "flour",
         "sugar", "dark chocolate chips", "butter", "baking soda", "salt");
      c.setIngredients("cookie dough", "chocolate chips");
      String[] ingredients = new String[2];
      ingredients[0] = "cookie dough";
      ingredients[1] = "chocolate chips";
      Assert.assertArrayEquals(ingredients, c.getIngredients());
   }
   
   /** tests method getCount.*/
   @Test public void getCountTest() {
      BakedItem.resetCount();
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, "flour",
         "sugar", "dark chocolate chips", "butter", "baking soda", "salt");
      Assert.assertEquals(BakedItem.getCount(), 1);
   } 
   
   /** tests method setCount.*/
   @Test public void resetCountTest() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, "flour",
         "sugar", "dark chocolate chips", "butter", "baking soda", "salt");
      BakedItem.resetCount();
      Assert.assertEquals(BakedItem.getCount(), 0);
   }
    
    /** tests method toString.*/
   @Test public void toStringTest() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, "flour",
         "sugar", "dark chocolate chips", "butter", "baking soda", "salt");
      Assert.assertTrue(c.toString().contains("Chips Delight"));
   }
   
   /** tests method toString.*/
   @Test public void toStringTest2() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, "flour",
         "sugar", "dark chocolate chips");
      Assert.assertTrue(c.toString().contains("Chips Delight"));
   }
   
   /** tests method toString.*/
   @Test public void toStringTest3() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, "flour",
         "sugar", "dark chocolate chips", "butter", "baking soda", "test",
         "test", "test", "test", "test", "test", "test");
      Assert.assertTrue(c.toString().contains("Chips Delight"));
   }
   
   /** tests method price in Cookie class.*/
   @Test public void cookiePriceTest() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, "flour",
         "sugar", "dark chocolate chips", "butter", "baking soda", "salt");
      Assert.assertEquals(4.2, c.price(), .000001);
   }
}
