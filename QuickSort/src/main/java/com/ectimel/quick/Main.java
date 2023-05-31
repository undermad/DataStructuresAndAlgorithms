package com.ectimel.quick;

public class Main {
//    Divide and Conquer Method
//    worst case is n^2 (quadratic time complexity)

    public static void main(String[] args) {
//        {12, 3, 4, 2, 123, -1, 9, 0};
        int[] arr = {12, 3, 4, 2, 123, -1, 9, 0};
//                {12, 1, 3, 4, 31, 23, -1, 2};
        quickSort(arr, 0, arr.length);


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void quickSort(int[] input, int start, int end) {

        if (end - start < 2) {
            return;
        }

        // actual operation
        int pivotIndex = partition(input, start, end);

        // here, we divide array into two arrays

        // left
        quickSort(input, start, pivotIndex);

        // right
        quickSort(input, pivotIndex + 1, end);

    }

    private static int partition(int[] input, int start, int end) {
        // This is using the first element as the pivot - start
        int pivot = input[start];
        int i = start;
        int j = end;


        while (i < j) {

            do {
                j--;
            } while (i < j && input[j] > pivot);
            if (i < j) {
                input[i] = input[j];
            }

            do {
                i++;
            }
            while (i < j && input[i] < pivot);
            if (i < j) {
                input[j] = input[i];
            }

        }
        input[j] = pivot;
        return j;
    }

}
