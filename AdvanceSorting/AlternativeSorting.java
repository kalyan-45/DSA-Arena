package AdvanceSorting;

import java.util.Arrays;

public class AlternativeSorting {
    public static void alternativeSorting (int[] arr) {
        int n = arr.length;
        boolean isComplete;
        for (int i = 0; i < n - 1; i++) {
            isComplete = true;
            for (int j = 0; j < n- 1 - i; j++) {
                if(arr[j] > arr[j + 1]) {
                    isComplete = false;
                    //Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (isComplete) {
                break;
            }
        }

        int[] tempArr = new int[n];

        int ArrIndex = 0;

        for (int i = 0, j = n-1; i <= n / 2 || j > n / 2; i++, j--) {
            if(ArrIndex < n)
            {
                tempArr[ArrIndex] = arr[j];
                ArrIndex++;
            }

            if(ArrIndex < n)
            {
                tempArr[ArrIndex] = arr[i];
                ArrIndex++;
            }
        }

        for (int i = 0; i < n; i++)
            arr[i] = tempArr[i];
    }

    // Driver Code
    public static void main(String args[])
    {
        int arr[] = { 10, 44, 77, 11};
        int n = arr.length;
        alternativeSorting(arr);

        for (int i = 0; i < n; i++)
            System.out.print(arr[i]+" ");
    }
}

