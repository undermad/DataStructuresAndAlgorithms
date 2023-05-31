package com.ectimel.quick;

public class QuickSort20230531GoodMorning {

    public static void main(String[] args) {

        int[] arr = {1213, 123, 124, 154, 354, 25, 435, 34, 624, 652, 4532, 56, 3465, 265, 246, 34563, 123, 14};

        quickSort(arr, 0, arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    private static void quickSort(int[] arr, int start, int end) {

        if (end - start < 2)
            return;

        int pivotIndex = partition(arr, start, end);
        quickSort(arr, start, pivotIndex);
        quickSort(arr, pivotIndex + 1, end);
    }

    private static int partition(int[] arr, int start, int end) {

        int pivot, i, j;

        pivot = arr[start];
        i = start;
        j = end;

        while (i < j) {

            while (i < j && arr[--j] > pivot);
            if (i < j)
                arr[i] = arr[j];

            while (i < j && arr[++i] < pivot);
            if (i < j)
                arr[j] = arr[i];

        }
        arr[j] = pivot;
        return j;


    }

}
