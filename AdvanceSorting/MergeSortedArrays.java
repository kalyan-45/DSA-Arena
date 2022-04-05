package AdvanceSorting;

import java.util.Scanner;

public class MergeSortedArrays {


    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int sizeArray1 = scanner.nextInt();
        int[] sortedArray1 = getArrayInput(sizeArray1, scanner);
        int sizeArray2 = scanner.nextInt();
        int[] sortedArray2 = getArrayInput(sizeArray2, scanner);

        int[] ascendingMerge = mergeBothInAscendingOrder(sortedArray1, sortedArray2);

        for (int i = 0; i < ascendingMerge.length; i++) {
            System.out.print(ascendingMerge[i]);
        }
    }
    private static int[] mergeBothInAscendingOrder(int arr1[], int arr2[]) {
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
    private static int[] getArrayInput(int size, Scanner scanner) {
        int[] arr1 = new int[size];
        for (int i = 0; i < size; i++) {
            arr1[i] = scanner.nextInt();
        }
        return arr1;
    }
}
