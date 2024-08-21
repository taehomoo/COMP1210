import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Is a menu app for HexagonalPrismList, has various options offered to edit
 the array list, or to view the array list.
 *
 * @author Andrew Moon - COMP1210 - 006
 * @version 9/30/22
 */

public class HexagonalPrismListMenuApp {

   /**
   * main for menu app, holds code that allows for user to access array
   list in different ways.
   * @param args Command line arguments not used.
   * @throws FileNotFoundException if file is not found
   */
      
   public static void main(String[] args) throws FileNotFoundException {
      Scanner scan = new Scanner(System.in);
      String listName = "*** no list name assigned ***";
      String fileName = "";
      ArrayList<HexagonalPrism> hexA = new ArrayList<HexagonalPrism>();
      HexagonalPrismList pList = new HexagonalPrismList(listName, hexA);
      String code = "";
      System.out.print("HexagonalPrism List System Menu\n"
         + "R - Read File and Create HexagonalPrism List\n"
         + "P - Print HexagonalPrism List\n"
         + "S - Print Summary\n"
         + "A - Add HexagonalPrism\n"
         + "D - Delete HexagonalPrism\n"
         + "F - Find HexagonalPrism\n"
         + "E - Edit HexagonalPrism\n"
         + "Q - Quit\n");
      do {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         code = scan.nextLine();
         if (code.length() == 0) {
            continue;
         }
         code = code.toUpperCase();
         char codeChar = code.charAt(0);
         switch(codeChar) {
            case 'R':
               System.out.print("\tFile name: ");
               fileName = scan.nextLine();
               pList = pList.readFile(fileName);
               System.out.print("\tFile read in and HexagonalPrism "
                  + "List created\n\n");
               break;
            case 'P':
               System.out.println(pList.toString());
               break;
            case 'S':
               System.out.print(pList.summaryInfo());
               System.out.print("\n");
               break;
            case 'A':
               System.out.print("\tLabel: ");
               String label = scan.nextLine();
               System.out.print("\tEdge: ");
               double edge = Double.parseDouble(scan.nextLine());
               System.out.print("\tHeight: ");
               double height = Double.parseDouble(scan.nextLine());
               pList.addHexagonalPrism(label, edge, height);
               System.out.println("\t*** HexagonalPrism added ***\n");
               break;
            case 'D':
               String labelD = "";
               System.out.print("\tLabel: ");
               String searchLabel = scan.nextLine();
               if (pList.deleteHexagonalPrism(searchLabel) == null) {
                  System.out.println("\t\"" + searchLabel + "\" not found\n");
               }
               else {
                  System.out.println("\t\"" + searchLabel + "\" deleted\n");
               }
               break;
            case 'F':
               System.out.print("\tLabel: ");
               String labelF = scan.nextLine();
               if (pList.findHexagonalPrism(labelF) != null) {
                  System.out.println(pList.findHexagonalPrism(labelF));
               }
               else {
                  System.out.println("\t\"" + labelF + "\" not found\n");
               }
               break;
               
            case 'E':
               String labelE = "";
               double edgeE;
               double heightE;
               System.out.print("\tLabel: ");
               labelE = scan.nextLine();
               System.out.print("\tEdge: ");
               edgeE = Double.parseDouble(scan.nextLine());
               System.out.print("\tHeight: ");
               heightE = Double.parseDouble(scan.nextLine());
               if (pList.editHexagonalPrism(labelE, edgeE, heightE)) {
                  System.out.println("\t\"" + labelE + "\" successfully "
                     + "edited\n");
               }
               else {
                  System.out.println("\t\"" + labelE + "\" not found\n");
               }
               break;
            case 'Q':
               break;
            default:
               System.out.print("\t*** invalid code ***\n");
         }
         
      } while (!code.equalsIgnoreCase("Q"));
   }
}