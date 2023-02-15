import java.nio.file.Path;

public class asd {


    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 1, 6, 4, 23, 4, 44, 12341, 4443, 314141, 132, 14, 151, 14, 1515, 1, 123};
        for (int lastUnsortedElement = arr.length - 1; lastUnsortedElement > 0; lastUnsortedElement--) {
            for (int i = 0; i < lastUnsortedElement; i++) {
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
