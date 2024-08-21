import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Is the main method for hexagonalprismlist, scans through a given file
 and sends information through to HexagonalPrismList.java.
 *
 * @author Andrew Moon - COMP1210 - 006
 * @version 9/23/22
 */


public class HexagonalPrismListApp {

   /**
   * main method that scans information from a file, creates an array of
   HexagonalPrism objects.
   * @param args Command Line arguments (not used)
   * @throws FileNotFoundException exception for not found file
   */
   public static void main(String[] args) throws FileNotFoundException {
      ArrayList<HexagonalPrism> prismsList = new ArrayList<HexagonalPrism>();
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter file name: ");
      String fileName = scan.nextLine();
      Scanner fileScan = new Scanner(new File(fileName));
      String prismListName = fileScan.nextLine();
      while (fileScan.hasNext()) {
         String label = fileScan.nextLine();
         double edge = Double.parseDouble(fileScan.nextLine());
         double height = Double.parseDouble(fileScan.nextLine());
         HexagonalPrism hex = new HexagonalPrism(label, edge, height);
         prismsList.add(hex);
      }
      fileScan.close();
      HexagonalPrismList pList = new HexagonalPrismList(prismListName, prismsList);
      System.out.println("\n" + pList.toString());
      System.out.println("\n" + pList.summaryInfo());
   }

}