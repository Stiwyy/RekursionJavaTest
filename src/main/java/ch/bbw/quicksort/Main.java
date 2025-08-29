package ch.bbw.quicksort;
import java.util.Arrays;
import ch.bbw.quicksort.Quicksort;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 9, 4, 6, 5, 3};

        System.out.println("Unsortiertes Array:");
        System.out.println(Arrays.toString(arr));

        Quicksort sorter = new Quicksort();
        sorter.quickSort(arr, 0, arr.length - 1);

        System.out.println("Sortiertes Array:");
        System.out.println(Arrays.toString(arr));
    }
}
