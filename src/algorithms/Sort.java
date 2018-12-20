package algorithms;

/**
 * Interface for algorithms that sort generic arrays by natural ordering.
 * @author jerome9189
 *
 */
public interface Sort {

   /**
    * Sorts an array in ascending order.
    * 
    * @param arr generic array
    * @throws IllegalArgumentException if the argument passed is null
    */
   <E extends Comparable<E>> void sort(E[] arr);

   /**
    * Swaps the elements at the indices i and j of an array
    * 
    * @param arr generic array
    * @param i array index
    * @param j array index
    * @throws IllegalArgumentException if the array is null or either i or j are valid
    *            indices of arr
    */
   static <E> void swap(E[] arr, int i, int j) {
      if (arr != null && arr.length > i && arr.length > j && i >= 0 && j >= 0) {
         E temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
      } else {
         throw new IllegalArgumentException();
      }

   }
}
