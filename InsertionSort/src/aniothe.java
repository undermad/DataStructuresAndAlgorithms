public class aniothe {
    public static void main(String[] args) {
        int[] arr = {11231,12312,4,234,2,5,53,465,4536,456,345,62,62,6,25,345,3,612,61,6,2563,45,345,37,2523};

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < arr.length; firstUnsortedIndex++){
            int newElement = arr[firstUnsortedIndex];
            int i;

            for (i = firstUnsortedIndex; i > 0 && arr[i-1] > newElement; i--){
                arr[i] = arr[i-1];
            }
            arr[i] = newElement;
        }


        for (int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
