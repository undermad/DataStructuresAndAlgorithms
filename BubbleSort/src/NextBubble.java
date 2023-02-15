import java.nio.file.Path;

public class NextBubble {
    public static void main(String[] args) {
        // O(n^2)
        // quadratic
        // inefficient


        int[] arr = {2,4,1,5,1,12};

        int counter = 0;

        for(int unsorted= arr.length-1; unsorted>0; unsorted--){
            for (int i = 0; i<unsorted; i++){
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
                counter++;
            }
        }

        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println(counter);


    }

}
