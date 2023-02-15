public class Shell {
    public static void main(String[] args) {
        int[] arr = {12312, 312, 123, 231, 231231, 1245, 4234, 324, 453, 435, 345, 354, 345, 253, 15332, 123};


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
