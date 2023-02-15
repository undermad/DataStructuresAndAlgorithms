public class qweqwqewqew {
    public static void main(String[] args) {
        int[] arr = {123123, 123123, 231, 213, 324, 234, 1234, 1234, 23545, 12123, 14, 1};

        for (int lastUnsrotedIndex = arr.length - 1; lastUnsrotedIndex > 0; lastUnsrotedIndex--) {
            int largestIndex = 0;

            for (int i = 1; i <= lastUnsrotedIndex; i++) {
                if (arr[i] > arr[largestIndex]){
                    largestIndex = i;
                }
            }
            int temp = arr[largestIndex];
            arr[largestIndex] = arr[lastUnsrotedIndex];
            arr[lastUnsrotedIndex] = temp;
        }

        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }


}
