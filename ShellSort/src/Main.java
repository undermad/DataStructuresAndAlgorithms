public class Main {
    public static void main(String[] args) {
        // Shell Sort Algorithm
        // in-place algorithm - we don't need another array to complete sorting
        // time complexity depend on gap we choose - see wikipedia/shellsort
        // it is UNSTABLE algorithm!

        int[] arr = {12312, 3123, 1342, 324, 25, 345, 123, 123432, 342, 5436, 4536, 654, 264, 26, 345, 64, 7, 4567, 2, 245, 34, 53, 37636456, 234};

        for (int gap = arr.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < arr.length; i++) {
                int newElement = arr[i];
                int j;

                for (j = i; j >= gap && arr[j - gap] > newElement; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = newElement;
            }
        }
        // print arr to the console
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}