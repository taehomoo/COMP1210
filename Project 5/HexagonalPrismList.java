import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * Stores the name and an array list of HexagonalPrism objects. Also includes
 methods to access the HexagonalPrism objects.
 *
 * @author Andrew Moon - COMP1210 - 006
 * @version 9/23/22
 */
public class HexagonalPrismList {
   private String listName;
   private ArrayList<HexagonalPrism> prisms = new ArrayList<HexagonalPrism>();
   
   /**
   *
   * constructor for HexagonalPrismList, takes in a string and arraylist
   as parameters and assigns instance variables to the values passed in.
   * @param listIn passes in the name of the list
   * @param pIn passes in the array list of HexagonalPrism
   */
   public HexagonalPrismList(String listIn, ArrayList<HexagonalPrism> pIn) {
      listName = listIn;
      prisms = pIn;
   } 
   
   /**
   * returns a string representing the name of the list.
   * @return listName returns name of list
   */
   public String getName() {
      return listName;
   }
   
   /**
   * is called to see how many objects are in the array.
   * @return prisms.size() returns number of objects in array
   */
   public int numberOfHexagonalPrisms() {
      return prisms.size();
   }
   
   /**
   * is called to calculate the total surface area of all objects in array.
   * @return totalSa returns total surface area value
   */
   public double totalSurfaceArea() {
      double totalSa = 0;
      int index = 0;
      while (index < prisms.size()) {
         HexagonalPrism hex = prisms.get(index);
         totalSa += hex.surfaceArea();
         index++;
      }
      return totalSa;
   }
   
   /**
   * is called to calculate the total volume of all objects in array.
   * @return totalVol returns total volume value
   */
   public double totalVolume() {
      double totalVol = 0;
      int index = 0;
      while (index < prisms.size()) {
         HexagonalPrism hex = prisms.get(index);
         totalVol += hex.volume();
         index++;
      }
      return totalVol;
   }
   
   /**
   * is called to calculate the average surface area of all objects in array.
   * @return averageSa / prisms.size() returns the average surface area
   */
   public double averageSurfaceArea() {
      double averageSa = 0;
      int index = 0;
      if (prisms.size() > 0) {
         while (index < prisms.size()) {
            HexagonalPrism hex = prisms.get(index);
            averageSa += hex.surfaceArea();
            index++;
         }
         return averageSa / prisms.size();
      }
      else {
         return 0;
      }
   }
   
   /**
   * is called to calculate the average volume of all objects in array.
   * @return averageVol / prisms.size() returns average volume
   */
   public double averageVolume() {
      double averageVol = 0;
      int index = 0;
      if (prisms.size() > 0) {
         while (index < prisms.size()) {
            HexagonalPrism hex = prisms.get(index);
            averageVol += hex.volume();
            index++;
         }
         return averageVol / prisms.size();
      }
      else {
         return 0;
      }
   }
   
   /**
   * Puts all information of hexagonalprisms in array into a combined string.
   * @return finalString returns the result string.
   */
   public String toString() {
      System.out.print("\n");
      System.out.println("----- " + listName + " -----\n");
      int index = 0;
      String finalString = "";
      while (index < prisms.size()) {
         if (index == 0) {
            HexagonalPrism hex = prisms.get(index);
            finalString += hex.toString() + "\n";
            index++;
         }
         else {
            HexagonalPrism hex = prisms.get(index);
            finalString += "\n" + hex.toString() + "\n";
            index++;
         }
      }
      return finalString;
   }
   
   /**
   * Prints out information from methods called in HexagonalPrismList code.
   * @return output returns the final string of summaryInfo
   */
   public String summaryInfo() {
      DecimalFormat doubles = new DecimalFormat("#,##0.0##");
      System.out.print("----- Summary for " + listName + " -----");
      String output = "";
      output += "Number of HexagonalPrisms: " + prisms.size() + "\n";
      output += "Total Surface Area: " + doubles.format(totalSurfaceArea())
         + " square units\n";
      output += "Total Volume: " + doubles.format(totalVolume())
         + " cubic units\n";
      output += "Average Surface Area: " + doubles.format(averageSurfaceArea())
         + " square units\n";
      output += "Average Volume: " + doubles.format(averageVolume())
         + " cubic units\n";
      return output;
   }
   
   /**
   * gets the arraylist.
   * @return prisms returns HexagonalPrismList prisms.
   */
   public ArrayList<HexagonalPrism> getList() {
      return prisms;
   }
   
   /**
   * opens file that is passed in through parameter.
   * @param fileName file name of file being opened
   * @return pList returns the new HexagonalPrismList object
   * @throws FileNotFoundException if file is not found
   */
   public HexagonalPrismList readFile(String fileName) 
      throws FileNotFoundException {
      Scanner fileScan = new Scanner(new File(fileName));
      String listNameR = fileScan.nextLine();
      ArrayList<HexagonalPrism> prismsList = new ArrayList<HexagonalPrism>();
      while (fileScan.hasNext()) {
         String label = fileScan.nextLine();
         double edge = Double.parseDouble(fileScan.nextLine());
         double height = Double.parseDouble(fileScan.nextLine());
         HexagonalPrism hex = new HexagonalPrism(label, edge, height);
         prismsList.add(hex);
      }
      fileScan.close();
      HexagonalPrismList pList = new HexagonalPrismList(listNameR, prismsList);
      return pList;
   }
   
   /**
   * Adds a hexagonalprism to the array.
   * @param labelIn label of HexagonalPrism being added
   * @param edgeIn edge of HexagonalPrism being added
   * @param heightIn height of HexagonalPrism being added
   */
   public void addHexagonalPrism(String labelIn, double edgeIn, 
      double heightIn) {
      HexagonalPrism hex = new HexagonalPrism(labelIn, edgeIn, heightIn);
      prisms.add(hex);
   }
   
   /**
   * Finds a hexagonalprism from the hexagonalprism array that matches
   the label parameter passed in to find.
   * @param labelIn label of HexagonalPrism that the method searches for
   * @return hex returns hex that matches label parameter
   */
   public HexagonalPrism findHexagonalPrism(String labelIn) {
      for (HexagonalPrism hex : prisms) {
         if (labelIn.compareToIgnoreCase(hex.getLabel()) == 0) {
            return hex;
         }
      }
      return null;
   }
   
   /**
   * Uses string parameter passed in to find HexagonalPrism to delete.
   * @param labelIn label of HexagonalPrism that method searches for to delete.
   * @return hex returns hex that matches deleted HexagonalPrism object
   */ 
   public HexagonalPrism deleteHexagonalPrism(String labelIn) {
      for (HexagonalPrism hex : prisms) {
         if (labelIn.equalsIgnoreCase(hex.getLabel())) {
            prisms.remove(hex);
            return hex;
         }
      }
      return null;
   }
   
   /**
   * Method edits a certain hexagonalprism that is found through label
   parameter passed in.
   * @param labelIn parameter representing label of HexagonalPrism to find
   * @param edgeIn edge value passed in to change in HexagonalPrism object
   * @param heightIn height value passed in to change in HexagonalPrism object
   * @return true if was able to edit height and edge
   */
   public boolean editHexagonalPrism(String labelIn, double edgeIn, 
      double heightIn) {
      for (HexagonalPrism hex : prisms) {
         if (labelIn.equalsIgnoreCase(hex.getLabel())) {
            hex.setEdge(edgeIn);
            hex.setHeight(heightIn);
            return true;
         }  
      }
      return false;
   }
 
   
}