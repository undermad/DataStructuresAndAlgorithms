public class another {
    public static void main(String[] args) {
        int[] arr = {-123123,123123,-43,-53252,213213,123,14234,4325,345,654,456,456,345,3452,345345,123};

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < arr.length; firstUnsortedIndex++){
            int newElement = arr[firstUnsortedIndex];
            int i;

            for(i = firstUnsortedIndex; i > 0 && arr[i-1] > newElement; i--){
                arr[i] = arr[i-1];
            }
            arr[i] = newElement;
        }


        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
