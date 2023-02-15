public class secsor {
    public static void main(String[] args) {
        int[] arr = {123123,235235,23525,141,5636,253,36,7637,4,4543534,76357,25};

        for (int lastUnsortedIndex = arr.length-1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            int largest = 0;

            for (int i = 1; i <= lastUnsortedIndex; i++){
                if (arr[i] > arr[largest]){
                    largest = i;
                }
            }
            int temp = arr[largest];
            arr[largest] = arr[lastUnsortedIndex];
            arr[lastUnsortedIndex] = temp;
        }

        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
