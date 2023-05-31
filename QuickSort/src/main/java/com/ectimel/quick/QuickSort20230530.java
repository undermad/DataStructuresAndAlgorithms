package com.ectimel.quick;

public class QuickSort20230530 {

    public static void main(String[] args) {
        int[] arr = {12, 21, 41, 451, 512, 51, 513, 52, 53, 2453, 46, 3457, 6547, 56, 85, 63, 5, 24, 1324, 1, 42, 635, 643, 6, 3245, 32};

        quickSort(arr, 0, arr.length);


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void quickSort(int[] arr, int start, int end) {

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
            } while (i < j && arr[j] > pivot);
            if (i < j) {
                arr[i] = arr[j];
            }

            do {
                i++;
            } while (i < j && arr[i] < pivot);
            if (i < j) {
                arr[j] = arr[i];
            }
        }

        arr[j] = pivot;
        return j;
    }

}
