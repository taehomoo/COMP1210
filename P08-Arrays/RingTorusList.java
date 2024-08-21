import java.text.DecimalFormat;

/**
 * Creates the class RingTorusList and methods included within the class.
 * Project 8
 * @author Andrew Moon - COMP1210 - 006
 * @version 10/28/22
 */

public class RingTorusList {
/**
   * Creates methods for RingTorusList.
   * @param args Command Line arguments (not used)
   */

   private String listName;
   private RingTorus[] list;
   private int num;
   
   /**
   * constructor for RingTorusList.
   * @param nameIn parameter representing RingTorusList name.
   * @param listIn parameter passing in array of RingTorus
   * @param numIn parameter representing number of RingTorus objects in array
   */
   public RingTorusList(String nameIn, RingTorus[] listIn, int numIn) {
      listName = nameIn;
      list = listIn;
      num = numIn;
   }
   
   /**
   * gets the name of RingTorusList object.
   * @return listName returns name of RingTorusList object
   */
   public String getName() {
      return listName;
   }
   
   /**
   * gets number of Ring Toruses in RingTorusList.
   * @return num returns number of Ring Toruses
   */
   public int numberOfRingToruses() {
      return num;
   }
   
   /**
   * calculates total diameter of RingTorus objects in list.
   * @return 0 if no RingTorus objects in list, returns sum of diameter if else.
   */
   public double totalDiameter() {
      double sumD = 0.0;
      if (num == 0) {
         return 0;
      }
      for (int i = 0; i < num; i++) {
         sumD += list[i].diameter();
      }
      return sumD;
   }
   
   /**
   * calculates total surface area of RingTorus objects in list.
   * @return 0 if no RingTorus objects in list, sum of surface area if else
   */
   public double totalSurfaceArea() {
      double sumSA = 0.0;
      if (num == 0) {
         return 0;
      }
      for (int i = 0; i < num; i++) {
         sumSA += list[i].surfaceArea();
      }
      return sumSA;
   }
   
   /**
   * calculates total volume of RingTorus objects in list.
   * @return 0 if no RingTorus objects in list, sum of volume if else
   */
   public double totalVolume() {
      double sumV = 0.0;
      if (num == 0) {
         return 0;
      }
      for (int i = 0; i < num; i++) {
         sumV += list[i].volume();
      }
      return sumV;
   }
   
   /**
   * calculates average diameter of RingTorus objects in list.
   * @return 0 if no RingTorus objects in list, average if else.
   */
   public double averageDiameter() {
      double sumD = 0.0;
      if (num == 0) {
         return 0;
      }
      for (int i = 0; i < num; i++) {
         sumD += list[i].diameter();
      }
      return sumD / num;
   }
   
   /**
   * calculates average surface area of RingTorus objects in list.
   * @return 0 if no RingTorus objects in list, average if else.
   */
   public double averageSurfaceArea() {
      double sumSA = 0.0;
      if (num == 0) {
         return 0;
      }
      for (int i = 0; i < num; i++) {
         sumSA += list[i].surfaceArea();
      }
      return sumSA / num;
   }
   
   /**
   * calculates average volume of RingTorus objects in list.
   * @return 0 if no RingTOrus objects in list, average if else.
   */
   public double averageVolume() {
      double sumV = 0.0;
      if (num == 0) {
         return 0;
      }
      for (int i = 0; i < num; i++) {
         sumV += list[i].volume();
      }
      return sumV / num;
   }
   
   /**
   * puts together a string with all information required.
   * @param listNameString name of list represented
   * @return output returns resulting string.
   */
   public String toString(String listNameString) {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String output = "";
      output += "----- Summary for " + listNameString + " -----\n";
      output += "Number of RingToruses: " + num + "\n";
      output += "Total Diameter: " + df.format(totalDiameter()) + " units\n";
      output += "Total Surface Area: " + df.format(totalSurfaceArea()) + " sq"
         + "uare units\n";
      output += "Total Volume: " + df.format(totalVolume()) + " cubic units\n";
      output += "Average Diameter: " + df.format(averageDiameter()) + " unit"
         + "s\n";
      output += "Average Surface "
         + "Area: " + df.format(averageSurfaceArea()) + " square units\n";
      output += "Average Volume: " + df.format(averageVolume()) + " cubic "
         + "units\n";
      return output;
   }
   
   /**
   * gets the list of RingTorus objects.
   * @return list returns the list
   */
   public RingTorus[] getList() {
      return list;
   }
   
   /**
   * adds a RingTorus object to the list.
   * @param labelIn label of new RingTorus object.
   * @param largeRIn large radius of new RingTorus object
   * @param smallRIn small radius of new RingTorus object
   */
   public void addRingTorus(String labelIn, double largeRIn, double smallRIn) {
      RingTorus rt = new RingTorus(labelIn, largeRIn, smallRIn);
      int i = num;
      list[i] = rt;
      num++;
   } 
   
   /**
   * finds RingTorus in list.
   * @param labelIn label name of RingTorus method looks for.
   * @return list[i] returns RingTorus object that was looking for
   */
   public RingTorus findRingTorus(String labelIn) {
      for (int i = 0; i < num; i++) {
         if (list[i].getLabel().equalsIgnoreCase(labelIn)) {
            return list[i];
         }  
      }
      return null;
   } 
   
   /**
   * deletes RingTorus from list.
   * @param labelIn label name of RingTorus method looks for.
   * @return rt returns RingTorus object that was deleted
   */
   public RingTorus deleteRingTorus(String labelIn) {
      for (int i = 0; i < num; i++) {
         if (list[i].getLabel().equalsIgnoreCase(labelIn)) {
            RingTorus rt = new 
               RingTorus(list[i].getLabel(), list[i].getLargeRadius(), 
               list[i].getSmallRadius());
            for (int j = i; j < num - 1; j++) {
               list[j] = list[j + 1];
            }
            list[num - 1] = null;
            num--;
            return rt;
         }
      }
      return null;
   }
   
   /**
   * edits a RingTorus object from the list.
   * @param lIn label passed in to identify RingTorus object.
   * @param largeRIn new large radius value
   * @param smallRIn new small radius value
   * @return true if successfully edited RingTorus, false if else
   */
   public boolean editRingTorus(String lIn, double largeRIn, double smallRIn) {
      for (int i = 0; i < num; i++) {
         if (list[i].getLabel().equalsIgnoreCase(lIn)) {
            list[i].setLargeRadius(largeRIn);
            list[i].setSmallRadius(smallRIn);
            return true;
         }
      }
      return false;
   }
   
   /**
   * finds RingTorus with the largest volume.
   * @return null if no RingTorus objects in list, largest volume object else
   */
   public RingTorus findRingTorusWithLargestVolume() {
      RingTorus largest = new RingTorus("", 2.0, 1.0);
      if (num == 0) {
         return null;
      }
      for (int i = 0; i < num; i++) {
         if (i == 0) {
            largest.setLabel(list[i].getLabel());
            largest.setLargeRadius(list[i].getLargeRadius());
            largest.setSmallRadius(list[i].getSmallRadius());
         }
         if (list[i].volume() > largest.volume()) {
            largest.setLabel(list[i].getLabel());
            largest.setLargeRadius(list[i].getLargeRadius());
            largest.setSmallRadius(list[i].getSmallRadius());
         }
      }
      return largest;
   }
}