public class AlgorithmSelectionSort {
    public static void main(String[] args) {
        int[] arr = {123, 123, 123, 312, 5345, 35, 35, 6, 5674, 6475634, 456, 67, 67, 3};

        for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largestIndex = 0;

            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (arr[i] > arr[largestIndex]) {
                    largestIndex = i;
                }
            }
            int temp = arr[largestIndex];
            arr[largestIndex] = arr[lastUnsortedIndex];
            arr[lastUnsortedIndex] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
