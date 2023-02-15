public class asdqdwqw {
    public static void main(String[] args) {
        int[] arr = {123,312,23,25,2525,3245,36,3,62,4523,534,6435,745,2134};


        for (int firstUnsortedIndex = 1; firstUnsortedIndex < arr.length; firstUnsortedIndex++){
            int newElement = arr[firstUnsortedIndex];
            int i;

            for (i = firstUnsortedIndex; i > 0 && arr[i-1] > newElement; i--){
                arr[i] = arr[i-1];
            }
            arr[i] = newElement;
        }

        for (int i = 0; i<arr.length; i ++ ){
            System.out.print(arr[i] + " ");
        }

    }


}
