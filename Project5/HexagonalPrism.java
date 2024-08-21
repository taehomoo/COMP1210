import java.text.DecimalFormat;

/**
 * Creates a HexigonalPrism class and creates methods related to the class.
 *
 * @author Andrew Moon - COMP1210 - 006
 * @version 9/16/22
 */


public class HexagonalPrism {

/**
   * Creates parts of HexagonalPrism class. 
   * @param args Command Line arguments (not used)
   */


   private String label = "";
   private double edge = 0;
   private double height = 0;

   /**
      * Takes in label, edge, and height values, and calls methods to assign
         them.
      *
      * @param labelIn Prism label
      * @param edgeIn Prism edge value
      * @param heightIn prism height value
      */

   public HexagonalPrism(String labelIn, double edgeIn, double heightIn) {
   
      setLabel(labelIn);
      setEdge(edgeIn);
      setHeight(heightIn);
   
   }
 /**
   * Returns a string representing lable field.
   * @return label returns label field
   */

   public String getLabel() {
      return label;
   }
   
   /**
   * Determines whether or not the string parameter is null.
   * @param str represents the string label to determine if it is null or not
   * @return isString to set or not set label field
   */

    
   public boolean setLabel(String str) {
      boolean isString = false;
      if (str != null) {
         isString = true;
         label = str.trim();
      }
      return isString;
   }
   
   /**
   * returns a double representing edge field.
   * @return edge returns double edge field
   */

   public double getEdge() {
      return edge;
   }
   
   /**
   * Determines if edge parameter is greater than 0.
   * @param edgeParam edge value of prism
   * @return isEdge returns true or false depending on edgeParam value
   */

   public boolean setEdge(double edgeParam) {
      boolean isEdge = false;
      if (edgeParam > 0) {
         edge = edgeParam;
         isEdge = true;
      }
      return isEdge;
   }
   
   /**
   * Returns double representing height field.
   * @return height returns double height field.
   */

   public double getHeight() {
      return height;
   }
   
   /**
   * Determines if height parameter is greater than zero.
   * @param heightParam height of prism
   * @return isHeight to state if height is greater than zero or not
   */

   
   public boolean setHeight(double heightParam) {
      boolean isHeight = false;
      if (heightParam > 0) {
         isHeight = true;
         height = heightParam;
      }
      return isHeight;
   }
   
   /**
   * Calculates surface area of prism.
   * @return surfaceA returns calculated value
   */

   public double surfaceArea() {
      double surfaceA;
      surfaceA = (6 * edge * height) + ((3 * Math.sqrt(3)) * (edge * edge));
      return surfaceA;
   }
   
   /**
   * Calculates lateral surface area of prism.
   * @return latSurf returns calculated value
   */

   public double lateralSurfaceArea() {
      double latSurf;
      latSurf = 6 * edge * height;
      return latSurf;
   }
   
   /**
   * Calculates value of base area of prism.
   * @return baseA returns calculated value
   */

   
   public double baseArea() {
      double baseA;
      baseA = (3 * Math.sqrt(3)) * ((edge * edge) / 2);
      return baseA;
   }
   
   /**
   * Calculates value of volume of prism.
   * @return vol returns calculated value
   */

   
   public double volume() {
      double vol;
      vol = ((3 * Math.sqrt(3)) / 2) * ((edge * edge) * height);
      return vol;
   }
   
   /**
   * Creates string containing all information of a HexagonalPrism object.
   * @return output returns the completed string
   */

   public String toString() {
      DecimalFormat doubles = new DecimalFormat("#,##0.0##");
      String output = "HexagonalPrism \"" + label + "\" has 8 faces, 18 "
         + "edges, and 12 vertices.\n";
      output += "\tedge = " + doubles.format(edge) + " units\n";
      output += "\theight = " + doubles.format(height) + " units\n";
      output += "\tlateral surface area = " 
         + doubles.format(lateralSurfaceArea()) + " square units\n";
      output += "\tbase area = " + doubles.format(baseArea()) + " square un"
         + "its\n";
      output += "\tsurface area = " + doubles.format(surfaceArea()) + " square "
         + "units\n";
      output += "\tvolume = " + doubles.format(volume()) + " cubic units\n";
      return output;
   }
   
}