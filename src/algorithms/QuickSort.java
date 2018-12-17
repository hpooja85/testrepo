package algorithms;

public class QuickSort implements Sort {
   public static <E extends Comparable<E>> void sort(E[] arr) {
      quickSort(arr, 0, arr.length - 1);
   }

   private static <E extends Comparable<E>> void quickSort(E[] arr, int low, int high) {
      // TODO Auto-generated method stub
      int pivot = partition(arr, low, high);
      quickSort(arr, low, pivot - 1);
      quickSort(arr, pivot + 1, high);
   }

   private static <E extends Comparable<E>> int partition(E[] arr, int low, int high) {
      int pivot = high;
      int i = low;
      //TODO
      return 0;
   }
   
   
}
