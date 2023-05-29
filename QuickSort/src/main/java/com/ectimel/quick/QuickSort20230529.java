package com.ectimel.quick;

public class QuickSort20230529 {
    public static void main(String[] args) {

        int[] arr = {1, 5, 2, 1, -4, -6, -4, 12, 5, 7, 9};

        quickSort(arr, 0, arr.length);


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    private static void quickSort(int[] arr, int start, int end) {

        // because we include pivotIndex that we decrement at do-whole loop in partition method
        if (end - start < 2) {
            return;
        }

        int pivotIndex = partition(arr, start, end);
        quickSort(arr, start, pivotIndex);
        quickSort(arr, pivotIndex + 1, end);

    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[start];
        int i = start;
        int j = end;

        while (i < j) {
            do {
                j--;
            } while (i < j && arr[j] >= pivot);
            if (i < j) {
                arr[i] = arr[j];
            }

            do {
                i++;
            } while (i < j && arr[i] <= pivot);
            if (i < j) {
                arr[j] = arr[i];
            }
        }
        arr[j] = pivot;
        return j;
    }

}
