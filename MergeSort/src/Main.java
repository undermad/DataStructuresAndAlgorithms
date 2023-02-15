public class Main {
    public static void main(String[] args) {
        // not in place algorithm - we use others arrays to complete sorting
        // O(nlogn) - base 2
        // stable algorithm
        int[] arr = {21, 1, 32, 15, 53, 6, 5};

        mergeSort(arr, 0, arr.length);
        for (int j : arr) {
            System.out.println(j);
        }

    }

    //{21, 1, 32, 15, 53, 6, 5}
    public static void mergeSort(int[] input, int start, int end) {
        if (end - start < 2) {
            return;
        }
        int mid = (start + end) / 2;
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);

    }

    //{21, 1, 32, 15, 53, 6, 5}
    public static void merge(int[] input, int start, int mid, int end) {
        if (input[mid - 1] < input[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);

    }
}