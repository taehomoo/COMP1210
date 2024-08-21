import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

/**
 * Creates the class BakedItemList with it's included methods. The
 BakedItemList creates an array list of BakedItem objects, and defines methods
 to read in data from a file, and generate reports on the BakedItemList.
 * Project 11
 * @author Andrew Moon - COMP1210 - 006
 * @version 11/18/22
 */

public class BakedItemList {
   private String listName;
   private BakedItem[] itemList;
   private int itemCount;
   private String[] excludedRecords;
   private int excludedCount;
   private static int listCount = 0;
   
   /**
   * constructor for BakedItemList.
   */
   public BakedItemList() {
      listName = "";
      itemList = new BakedItem[100];
      itemCount = 0;
      excludedRecords = new String[30];
      excludedCount = 0;
      listCount++;
   }
   
   /**
   * gets the list name.
   * @return listName returns list name
   */
   public String getListName() {
      return listName;
   }
   
   /**
   * sets the list name.
   * @param listNameIn list name to set to listName
   */
   public void setListName(String listNameIn) {
      listName = listNameIn;
   }
   
   /**
   * gets the itemList.
   * @return itemList returns the itemList
   */
   public BakedItem[] getItemList() {
      return itemList;
   }
   
   /**
   * sets the itemList.
   * @param itemListIn parameter to set itemList to
   */
   public void setItemList(BakedItem[] itemListIn) {
      itemList = itemListIn;
   }
   
   /**
   * gets item count.
   * @return itemCount returns item count
   */
   public int getItemCount() {
      return itemCount;
   }
   
   /**
   * sets the item count.
   * @param itemCountIn value to set item count to
   */
   public void setItemCount(int itemCountIn) {
      itemCount = itemCountIn;
   }
   
   /**
   * gets excluded records.
   * @return excludedRecords returns excluded records
   */
   public String[] getExcludedRecords() {
      return excludedRecords;
   }
   
   /**
   * sets excluded records.
   * @param excludedRecordsIn parameter to set excludedRecords to
   */
   public void setExcludedRecords(String[] excludedRecordsIn) {
      excludedRecords = excludedRecordsIn;
   }
   
   /**
   * gets excluded count.
   * @return excludedCount returns excluded count
   */
   public int getExcludedCount() {
      return excludedCount;
   }
   
   /**
   * sets excluded count.
   * @param excludedCountIn parameter value to set excludedCount to
   */
   public void setExcludedCount(int excludedCountIn) {
      excludedCount = excludedCountIn;
   }
   
   /**
   * gets listCount.
   * @return listCount returns listCount
   */
   public static int getListCount() {
      return listCount;
   }
   
   /**
   * resets listCount.
   */
   public static void resetListCount() {
      listCount = 0;
   }
   
   /**
   * reads in data from item file, creates appropriate BakedItem objects
   based on data read in and throws appropriate exception if caught.
   * @param dataFileIn data file name
   * @throws FileNotFoundException if file not found
   */
   public void readItemFile(String dataFileIn) throws FileNotFoundException {
      Scanner fileScan = new Scanner(new File(dataFileIn));
      listName = fileScan.nextLine().trim();
      String line = "";
      
      while (fileScan.hasNextLine()) {
         try {
            line = fileScan.nextLine();
            Scanner lineScan = new Scanner(line);
            lineScan.useDelimiter(",");
            String item = lineScan.next();
         
         
            if (item.equals("C")) {
            
               String name = lineScan.next();
               String flavor = lineScan.next();
               int quantity = Integer.parseInt(lineScan.next());
               String[] ingredients = new String[50];
               int count = 0;
               for (int i = 0; lineScan.hasNext(); i++) {
                  ingredients[i] = lineScan.next();
                  count++;
               }
               String[] copy = Arrays.copyOf(ingredients, count);
               Cookie c = new Cookie(name, flavor, quantity, copy);
               itemList[itemCount] = c;
               itemCount++;
            }
            
            else if (item.equals("P")) {
               String name = lineScan.next();
               String flavor = lineScan.next();
               int quantity = Integer.parseInt(lineScan.next());
               double crustCost = Double.parseDouble(lineScan.next());
               int count = 0;
               String[] ingredients = new String[50];
               for (int i = 0; lineScan.hasNext(); i++) {
                  ingredients[i] = lineScan.next();
                  count++;
               }
               String[] copy = Arrays.copyOf(ingredients, count);
               Pie p = new Pie(name, flavor, quantity, crustCost, copy);
               itemList[itemCount] = p;
               itemCount++;
            }
            
            else if (item.equals("K")) {
               String name = lineScan.next();
               String flavor = lineScan.next();
               int quantity = Integer.parseInt(lineScan.next());
               int layers = Integer.parseInt(lineScan.next());
               String[] ingredients = new String[50];
               int count = 0;
               for (int i = 0; lineScan.hasNext(); i++) {
                  ingredients[i] = lineScan.next();
                  count++;
               }
               String[] copy = Arrays.copyOf(ingredients, count);
               Cake k = new Cake(name, flavor, quantity, layers, copy);
               itemList[itemCount] = k;
               itemCount++;
            }
            
            else if (item.equals("W")) {
               String name = lineScan.next();
               String flavor = lineScan.next();
               int quantity = Integer.parseInt(lineScan.next());
               int layers = Integer.parseInt(lineScan.next());
               int tiers = Integer.parseInt(lineScan.next());
               int count = 0;
               String[] ingredients = new String[50];
               for (int i = 0; lineScan.hasNext(); i++) {
                  ingredients[i] = lineScan.next();
                  count++;
               }
               String[] copy = Arrays.copyOf(ingredients, count);
               WeddingCake w = new WeddingCake(name, flavor, quantity, 
                  layers, tiers, copy);
               itemList[itemCount] = w;
               itemCount++;
            }
            
            else {
               throw new InvalidCategoryException(item);
            }
         }
         
         catch (InvalidCategoryException e) {
            String s = "*** " + e + " in:\n" + line;
            excludedRecords[excludedCount] = s;
            excludedCount++;
         }
         
         catch (NumberFormatException e) {
            String s = "*** " + e + " in:\n" + line;
            excludedRecords[excludedCount] = s;
            excludedCount++;
         }
         
         catch (java.util.NoSuchElementException e) {
            String s = "*** " + e + " in:\n" + line;
            excludedRecords[excludedCount] = s;
            excludedCount++;
         }
      
      }
         
      fileScan.close();
   }
   /**
   * generates report string.
   * @return output returns report string
   */
   public String generateReport() {
      BakedItem[] sortList = Arrays.copyOf(itemList, itemCount);
      String output = "\n";
      output += "---------------------------------------\n";
      output += "Report for " + getListName() + "\n";
      output += "---------------------------------------\n";
      for (int i = 0; i < sortList.length; i++) {
         output += "\n" + sortList[i] + "\n";
      }
      return output;
   }
   
   /**
   * generates report string sorted by class.
   * @return output returns report string.
   */
   public String generateReportByClass() {
      BakedItem[] nSortList = Arrays.copyOf(itemList, itemCount);
      Arrays.sort(nSortList);
      String output = "\n";
      output += "---------------------------------------\n";
      output += "Report for " + getListName() + " (by Class)\n";
      output += "---------------------------------------\n";
      for (int i = 0; i < nSortList.length; i++) {
         output += "\n" + nSortList[i] + "\n";
      }
      return output;
   }
   
   /**
   * genereates report string sorted by price.
   * @return output returns output string
   */
   public String generateReportByPrice() {
      BakedItem[] pSortList = Arrays.copyOf(itemList, itemCount);
      Arrays.sort(pSortList, new PriceComparator());
      String output = "\n";
      output += "---------------------------------------\n";
      output += "Report for " + getListName() + " (by Price)\n";
      output += "---------------------------------------\n";
      for (int i = 0; i < pSortList.length; i++) {
         output += "\n" + pSortList[i] + "\n";
      }
      return output;
   }
   
   /**
   * generates report string sorted by flavor.
   * @return output returns output string
   */
   public String generateReportByFlavor() {
      BakedItem[] fSortList = Arrays.copyOf(itemList, itemCount);
      Arrays.sort(fSortList, new FlavorComparator());
      String output = "\n";
      output += "---------------------------------------\n";
      output += "Report for " + getListName() + " (by Flavor)\n";
      output += "---------------------------------------\n";
      for (int i = 0; i < fSortList.length; i++) {
         output += "\n" + fSortList[i] + "\n";
      }
      return output;
   }
   
   /**
   * generates excluded records report.
   * @return output returns report.
   */
   public String generateExcludedRecordsReport() {
      String output = "\n";
      output += "---------------------------------------\n";
      output += "Excluded Records Report\n";
      output += "---------------------------------------\n";
      for (int i = 0; i < excludedCount; i++) {
         output += "\n" + excludedRecords[i];
      }
      return output;
   }
}