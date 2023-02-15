public class Practice {
    public static void main(String[] args) {
        int[] arr= {123,12,43,423,243,234,-234,234,234,25,-3465,-3546,4567,47,4,-7345,634,6535,645,6,1};

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < arr.length; firstUnsortedIndex++){
            int newElement = arr[firstUnsortedIndex];
            int i;

            for(i = firstUnsortedIndex; i > 0 && arr[i-1] > newElement; i--){
                arr[i] = arr[i-1];
            }
            arr[i] = newElement;
        }

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }


    }


}
