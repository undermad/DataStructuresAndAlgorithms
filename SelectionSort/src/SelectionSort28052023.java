public class SelectionSort28052023 {
    public static void main(String[] args) {

        int[] arr = {12, 5, 4, 2, 6, 3, -1, 13};


        for (int i = 0; i < arr.length - 1; i++) {
            int minimum = i;

            for (int start = i + 1; start < arr.length; start++) {
                if (arr[start] < arr[minimum]) {
                    minimum = start;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minimum];
            arr[minimum] = temp;

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }


    }


}
