package AdvanceSorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 7, 3, 9, 6, 5, 1, 2, 4};
        int pivot = blackMagic(arr, 0, arr.length - 1);
        System.out.println(pivot);
        System.out.println(Arrays.toString(arr));

        quickSort(arr, 0, arr.length -1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort (int[] arr, int start, int end) {
        //1. Base case
        if (start >= end) {
            return;
        }

        //2. Recursive Call
        //2.1 Divide
        int index = blackMagic(arr, start, end);
        //2.2 Conquer

        quickSort(arr, start, index - 1);
        quickSort(arr, index + 1, end);

    }
    public static int blackMagic (int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start - 1;
        int j;

        for (j  = start; j < end; j++) {
            if (arr[j] < pivot) {
                // Choose and put into lef
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp =  arr[i];
        arr[i] = arr[end];
        arr[end] = temp;

        return i;
    }
}
