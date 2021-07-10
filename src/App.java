import java.util.Arrays;

import sorting.MySortings;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // time to test sorting algorithms.
        int[] arr = {5, 7, 8, 3, 2, 11, 17, 15};

        MySortings sort = new MySortings();
        int [] bubbleSortArr = sort.bubbleSort(arr);
        System.out.println(Arrays.toString(bubbleSortArr));

        int [] selectionSortArr = sort.selectionSort(arr);
        System.out.println(Arrays.toString(selectionSortArr));


    }
}
