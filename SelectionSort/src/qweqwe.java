public class qweqwe {
    public static void main(String[] args) {
        int[] arr = {123,132,132,132,43,432,124,523456,65,465,645,3564,254,234};

        for (int lastUnsortedIndex = arr.length-1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            int largestIndex = 0;
            for (int i= 1; i<= lastUnsortedIndex; i++){
                if (arr[i]> arr[largestIndex]){
                    largestIndex = i;
                }
            }
            int temp = arr[largestIndex];
            arr[largestIndex] = arr[lastUnsortedIndex];
            arr[lastUnsortedIndex] = temp;
        }

        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");

        }

    }



}
