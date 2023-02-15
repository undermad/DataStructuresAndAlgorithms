public class NextPracticeClass {
    public static void main(String[] args) {
        int[] arr = {12, 123, 5, 5, 245, 36, 235, 235, 56456, 253,3,1,2,4,1,1};
        int counter = 0;

        for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largestIndex = 0;

            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (arr[i] > arr[largestIndex]) {
                    largestIndex = i;
                }
                counter++;
            }

            int temp = arr[largestIndex];
            arr[largestIndex] = arr[lastUnsortedIndex];
            arr[lastUnsortedIndex] = temp;
        }

        System.out.println("Selection sort algorithm done in: " + counter);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


        // Here is bubble sort

        int[] arr2 = {12, 123, 5, 5, 245, 36, 235, 235, 56456, 253,12,12,32145,5,235,523};
        int counter2 = 0;

        for (int unsorted = arr2.length - 1; unsorted > 0; unsorted--) {
            for (int i = 0; i < unsorted; i++) {
                if (arr2[i] > arr2[i + 1]) {
                    int temp = arr2[i];
                    arr2[i] = arr2[i + 1];
                    arr2[i + 1] = temp;
                }
                counter2++;
            }
        }

        System.out.println();
        System.out.println();

        System.out.println("Bubble sort algorithm done in: " + counter2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

    }
}
