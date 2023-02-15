public class afaf {
    public static void main(String[] args) {
        int[] arr = {12312321, 12312, 1321, 14, 2, 25, 2, 652, 1, 51, 1421};

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
            System.out.print(arr[i] + " ");
        }

    }
}
