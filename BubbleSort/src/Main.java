import java.lang.reflect.Array;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        // BubbleSort - think as we put array in vertical position and heaviest element going to the bottom(end of array)
        // in-place algorithm - need only one array to complete sorting
        // O(n^2) time complexity - quadratic
        // it will take 100 setps to sort 10 items, 10 000 steps to sort 100 items and so on
        // Algorithm degrades quickly

        // implementation

        int[] toSort = {5, 4, 3, 6, 7, 1, 2, 0, 9, 8};

        for (int lastUnsortedIndex = toSort.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (toSort[i] > toSort[i + 1]) {
                    swap(toSort, i, i + 1);
                }
            }
        }

        printArray(toSort);

    }

    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void printArray(int[] arr){
        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
