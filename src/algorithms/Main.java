package algorithms;

import java.util.Arrays;

/**
 * Main class
 * @author coolj
 *
 */
public class Main {
   /**
    * Main method
    * @param args command line arguments
    */
   public static void main(String... args) {
      Integer[] arr = {9,9,9,9,9, Integer.MAX_VALUE, Integer.MIN_VALUE,9,9,9,9,69,9,9,4,1,100,4,1000000,4,1,-5};
      Sort qs = new QuickSort();
      qs.sort(arr);
      System.out.print(Arrays.asList(arr));
      System.out.println("Created Changes");
      
      System.out.println("Created new Changes");
      System.out.println("Created new Changes1");
      System.out.println("Created changes123");
      System.out.println("Create changes 12345");
      System.out.println("Create changes1111");
      System.out.println("create changes 12345");
      System.out.println("create changes 123456789");
   }
}
