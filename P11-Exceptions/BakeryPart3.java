import java.io.FileNotFoundException;

/**
 * Creates the class BakeryPart3 with the main method, can be used to create
 a summary of a BakedItemList with BakedItem objects. Has been modified
 in part 3 to throw exceptions.
 * Project 11
 * @author Andrew Moon - COMP1210 - 006
 * @version 11/18/22
 */

public class BakeryPart3 {
/**
* main class, reads in arg representing file, creates a BakedItemList object
from the file.
* @param args file read in
*/
   public static void main(String[] args) {
      BakedItemList bList = new BakedItemList();
      try {
         if (args.length == 0) {
            System.out.print("File name expected as command line argument.\n");
            System.out.print("Program ending.\n");
         }
         else {
            bList.readItemFile(args[0]);
            System.out.println(bList.generateReport());
            System.out.println(bList.generateReportByClass());
            System.out.println(bList.generateReportByPrice());
            System.out.println(bList.generateReportByFlavor());
            System.out.println(bList.generateExcludedRecordsReport());
         }
      }
      catch (FileNotFoundException e) {
         System.out.print("Attempted to read file: " + args[0]
            + " (No such file or directory)\n");
         System.out.print("Program ending.\n");
      }
   }
}