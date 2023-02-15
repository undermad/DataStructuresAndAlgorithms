import java.nio.file.Path;

public class AnotherSelectionSortAlgorithm {
    public static void main(String[] args) {
        int[] arr = {12,132123,213,213,32,4,1,5,5,6,66,456,54657,6534,345,453,342,345,564654,21};

        for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex> 0; lastUnsortedIndex--){
            int largestIndex = 0;
            for(int i = 1; i <= lastUnsortedIndex; i++){
                if (arr[i] > arr[largestIndex]){
                    largestIndex = i;
                }
            }
            int temp = arr[largestIndex];
            arr[largestIndex] = arr[lastUnsortedIndex];
            arr[lastUnsortedIndex] = temp;
        }


        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
