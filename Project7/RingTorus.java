import java.text.DecimalFormat;

/**
 * Creates the class RingTorus and the methods that the class includes.
 * Project 8
 * @author Andrew Moon - COMP1210 - 006
 * @version 10/11/22
 */
public class RingTorus implements Comparable<RingTorus> {
/**
   * Creates methods for RingTorus.
   * @param args Command Line arguments (not used)
   */

   private String label = "";
   private double largeR = 0.0;
   private double smallR = 0.0;
   private static int count = 0;
   
   /**
   * constructor for RingTorus.
   * @param labelIn string label of created RingTorus
   * @param largeRIn double large radius of created RingTorus
   * @param smallRIn double small radius of created RingTorus
   */
   public RingTorus(String labelIn, double largeRIn, double smallRIn) {
      setLabel(labelIn);
      setLargeRadius(largeRIn);
      setSmallRadius(smallRIn);
      count++;
   }
   
   /**
   * gets the label of RingTorus object.
   * @return label returns label
   */
   public String getLabel() {
      return label;
   }
   
    /**
   * sets the label of RingTorus object.
   * @param labelP string label parameter passed in to test
   * @return true if label is properly set, false if else
   */

   public boolean setLabel(String labelP) {
      if (labelP == null) {
         return false;
      }
      label = labelP.trim();
      return true;
   }
   
   /**
   * gets the largeRadius number of RingTorus object.
   * @return largeR returns large radius value
   */
   public double getLargeRadius() {
      return largeR;
   }
   
   /**
   * sets the large radius of RingTorus object.
   * @param radius double parameter that is large radius value tested
   * @return true if large radius is properly set, false if else
   */
   public boolean setLargeRadius(double radius) {
      if ((radius >= 0) && (radius > smallR)) {
         largeR = radius;
         return true;
      }
      return false;
   }
   
   /**
   * gets the small radius number of RingTorus object.
   * @return smallR returns small radius value
   */
   public double getSmallRadius() {
      return smallR;
   }
   
   /**
   * sets small radius value of RingTorus object.
   * @param radius double value parameter to be tested in method
   * @return true if small radius value is set in method, false if else
   */
   public boolean setSmallRadius(double radius) {
      if ((radius >= 0) && (radius < largeR)) {
         smallR = radius;
         return true;
      }
      return false;
   }
   
   /**
   * calculates diameter of RingTorus object.
   * @return returns calculated diameter
   */
   public double diameter() {
      return (2 * (largeR + smallR));
   }
   
   /**
   * calculates surface area of RingTorus object.
   * @return returns calculcated surface area
   */
   public double surfaceArea() {
      return ((2 * Math.PI * largeR) * (2 * Math.PI * smallR));
   }
   
   /**
   * calculates volume of RingTorus object.
   * @return calculated volume
   */
   public double volume() {
      return ((2 * Math.PI * largeR) * (Math.PI * (smallR * smallR)));
   }
   
   /**
   * puts information from methods into a string to be outputted.
   * @return output returns final string
   */
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String output = "";
      output += "RingTorus \"" + getLabel() + "\"\n";
      output += "\tlarge radius = " + getLargeRadius() + " units\n";
      output += "\tsmall radius = " + getSmallRadius() + " units\n";
      output += "\tdiameter = " + df.format(diameter()) + " units\n";
      output += "\tsurface area = " + df.format(surfaceArea()) + " square "
         + "units\n";
      output += "\tvolume = " + df.format(volume()) + " cubic "
         + "units\n";
      return output;
   }
   
   /**
   * gets count of how many RingTorus objects have been created.
   * @return returns static variable count
   */
   public static int getCount() {
      return count;
   }
   
   /**
   * resets count variable to 0.
   */
   public static void resetCount() {
      count = 0;
   }
   
   /**
   * tests if object passed through is of type RingTorus and has
   the same field values.
   * @param obj object to be tested
   * @return false if obj is not of type RingTorus
   */
   public boolean equals(Object obj) {
      if (!(obj instanceof RingTorus)) {
         return false;
      }
      else {
         RingTorus rt = (RingTorus) obj;
         return (label.equalsIgnoreCase(rt.getLabel())
               && (Math.abs(largeR - rt.getLargeRadius()) < .000001)
               && (Math.abs(smallR - rt.getSmallRadius()) < .000001));
      }
   }
   
   /**
   * required due to equals method.
   * @return 0 returns int 0.
   */
   public int hashCode() {
      return 0;
   }
   
   /**
   * compares current objects volume with object passed in parameter.
   * @param obj object that is passed to compare volume with
   * @return -1 if this objects volume is less than parameter object's,
   1 if this objects volume is greater, 0 if even.
   */
   public int compareTo(RingTorus obj) {
      if (this.volume() < obj.volume()) {
         return -1;
      }
      else if (this.volume() > obj.volume()) {
         return 1;
      }
      else {
         return 0;
      }
   }
}