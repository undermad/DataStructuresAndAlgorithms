public class OneMoreSelectionSort {
    public static void main(String[] args) {
        int[] arr = {13, 11, 1212, 123, 123, 54, 1, 12, 566, 56, 34, 3467, 4325, 3, 12, 32, 425, 345, 5346, 546, 235, 345, 5656, 324};

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

        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }



    }


}
