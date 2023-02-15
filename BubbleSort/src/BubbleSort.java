public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {2,3,4,5,1,3,2,34,511,34};
        for (int unsorted = arr.length - 1; unsorted>0; unsorted--){
            for(int i = 0; i<unsorted; i++){
                if (arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }

        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }


}
