public class OneMoreBubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 12, 3, 4, 1515, 1234, 14, 14, 112};

        for (int unsorted = arr.length - 1; unsorted > 0; unsorted--) {
            for (int i = 0; i < unsorted; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
