/**
 * Creates the InvalidCategoryException class, which defines a
 InvalidCategoryException exception. This exception is thrown if a BakedItem
 has an illegal category.
 * Project 11
 * @author Andrew Moon - COMP1210 - 006
 * @version 11/18/22
 */
public class InvalidCategoryException extends Exception {
/** constructor for InvalidCategoryException.
* @param category category parameter passed in to be represented.
*/
   public InvalidCategoryException(String category) {
      super("For category: " + "\"" + category + "\"");
   }
}