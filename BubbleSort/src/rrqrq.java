public class rrqrq {
    public static void main(String[] args) {
        int[] arr = {213,123,123,34,45,435,4312,5562};
         for (int unsorted = arr.length - 1; unsorted>0; unsorted--){
             for (int i = 0; i< unsorted; i++){
                 if(arr[i] > arr[i+1]){
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
