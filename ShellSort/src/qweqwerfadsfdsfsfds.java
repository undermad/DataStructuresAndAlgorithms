public class qweqwerfadsfdsfsfds {
    public static void main(String[] args) {
        int[] arr = {123213, 123, 132, 312, 43, 23, 544, 3534, 6, 612, 6243, 432, 65342, 52, 52, 6, 1231, 252345235};
        int counter = 0;

        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int firstUnsortedElement = gap; firstUnsortedElement < arr.length; firstUnsortedElement++) {
                int newElement = arr[firstUnsortedElement];
                int i;

                for (i = firstUnsortedElement; i >= gap && arr[i - gap] > newElement; i -= gap) {
                    arr[i] = arr[i-gap];
                    counter++;
                }

                arr[i] = newElement;
            }
        }

        for (int i = 0; i<arr.length; i++ ){
            System.out.print(arr[i] + " ");

        }
        System.out.println(counter);


    }
}
