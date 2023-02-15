public class Main {
    public static void main(String[] args) {
        //in place algorithm - we dont need to create another array
        // O(n^2) - quadratic
        // it is Stable alogrithm

        int[] arr = {12, 12, -15, 4, 4, 23, 23, 235, 14, 1, 1432142};

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < arr.length; firstUnsortedIndex++) {
            int newElement = arr[firstUnsortedIndex];
            int i;
            for (i = firstUnsortedIndex; i > 0 && arr[i - 1] > newElement; i--){
                arr[i] = arr[i-1];
            }
            arr[i] = newElement;
        }

        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }


    }
}