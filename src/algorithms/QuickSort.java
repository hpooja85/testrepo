package algorithms;

public class QuickSort implements Sort {
   @Override
   public <E extends Comparable<E>> void sort(E[] arr) {
      quickSort(arr, 0, arr.length - 1);
   }

   private static <E extends Comparable<E>> void quickSort(E[] arr, int low, int high) {
      if (low < high) {
         int pivot = partition(arr, low, high);
         quickSort(arr, low, pivot - 1);
         quickSort(arr, pivot + 1, high);
      }
   }

   private static <E extends Comparable<E>> int partition(E[] arr, int low, int high) {
      E pivot = arr[high];
      int j = low;
      for (int i = j; i <= high; i++) {
         if (arr[i].compareTo(pivot) <= 0) {
            Sort.swap(arr, i, j);
            j++;
         }
      }
      return j - 1;
   }
}
