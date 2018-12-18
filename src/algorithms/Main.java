package algorithms;

import java.util.Arrays;

public class Main {
   public static void main(String... args) {
      Integer[] arr = {9,9,9,9,9,9,9,9,9,69,9,9,4,1,100,4,1000000,4,1,-5};
      Sort qs = new QuickSort();
      qs.sort(arr);
      System.out.print(Arrays.asList(arr));
   }
}
