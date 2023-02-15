public class Main {
    public static void main(String[] args) {
        // Selection sort algorithm
        // O(n^2)
        // Unstable algorithm


        int[] arr = {1, 13, 123, 4, 14, 12, 4, 44, 512, 2, 3, 3};

        for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0;

            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if(arr[i] > arr[largest]){
                    largest = i;
                }
            }

            swap(arr, largest, lastUnsortedIndex);
        }


        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }





    public static void swap(int[] arr, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
}