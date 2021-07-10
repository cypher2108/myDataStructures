package sorting;

public class MySortings {

    public int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public int[] selectionSort(int[] arr) {
        for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largestElementIndex = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (arr[i] > arr[largestElementIndex]) {
                        largestElementIndex = i;
                }
            }
            int temp = arr[largestElementIndex];
            arr[largestElementIndex] = arr[lastUnsortedIndex];
            arr[lastUnsortedIndex] = temp;
        }
        return arr; 
    }

}
