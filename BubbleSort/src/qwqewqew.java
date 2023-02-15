public class qwqewqew {
    public static void main(String[] args) {
        int[] arr = {1232,123123,123,213,123,123,231,32,213,234,45356,456,2534,234,56,564,423,54,653};
        //stable
        for (int sorted = arr.length - 1; sorted > 0; sorted--){
            for (int i = 0; i<sorted; i++){
                if (arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }

        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }


}
