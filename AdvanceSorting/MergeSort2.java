package AdvanceSorting;

import java.util.Arrays;

public class MergeSort2 {
    public static void mergeSortImplementation(int[] arr, int start, int end) {
        //Base case
        int n = arr.length;
        if (n == 1) {
            return;
        }
        //2. Recursive call
        //2.1. Divide conquer
        int mid  = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = mid; i < n; i++) {
            right[i - mid] = arr[i];
        }
        //Conquer
        mergeSortImplementation(left, start, end);
        mergeSortImplementation(right, start, end);

        //Combine
        mergeArrays(left, right);
    }
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] mergeArray = new int[arr1.length + arr2.length];
        int l = 0, r = 0, m = 0;
        while (l < arr1.length && r < arr2.length) {
            if (arr1[l] <= arr2[r]) {
                //Choose left
                mergeArray[m] = arr1[l];
                l++;
            } else {
                //Choose right
                mergeArray[m] = arr2[r];
                r++;
            }
            m++;
        }

        if (r < arr2.length) {
            //left has got exhausted
            while (r < arr2.length) {
                mergeArray[m] = arr2[r];
                r++;
                m++;
            }
        } else {
            //Left has exhausted
            while (l < arr1.length) {
                mergeArray[m] = arr1[l];
                l++;
                m++;
            }
        }
        return mergeArray;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 11, 4, 14,15, 18, 10, 13};
        int[] arr2 = {2, 4, 8, 4, 9, 1, 5};
        int n = arr.length;;
        mergeSortImplementation(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));
        int[] ascendingMerge = mergeArrays(arr, arr2);
        for (int i : ascendingMerge) {
            System.out.print(i + " ");
        }

    }
}
