package algorithms;

public interface Sort {
   static <E extends Comparable<E>> void sort(E[] arr) {};
   static <E> void swap(E[] arr, int i, int j) {
      E temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
   }
}
