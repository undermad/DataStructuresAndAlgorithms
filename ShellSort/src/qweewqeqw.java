public class qweewqeqw {
    public static void main(String[] args) {
        int[] arr = {12312334, 234, 235, 3465, 34567, 45, 72, 72, 46, 43, 4567, 478, 32, 735, 6, 346, 3567, 47, 43, 7325634, 5, 5343453};

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


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
