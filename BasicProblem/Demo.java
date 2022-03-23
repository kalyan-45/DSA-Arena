import java.util.Arrays;
import java.util.Scanner;

public class Demo {
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
        mergeArrays(left, right, arr);
    }
    public static void mergeArrays(int[] left, int[] right, int[] mergeArray) {
        int l = 0, r = 0, m = 0;
        while (l < left.length && r < right.length) {
            if (left[l] <= right[r]) {
                //Choose left
                mergeArray[m] = left[l];
                l++;
            } else {
                //Choose right
                mergeArray[m] = right[r];
                r++;
            }
            m++;
        }

        if (r < right.length) {
            //left has got exhausted
            while (r < right.length) {
                mergeArray[m] = right[r];
                r++;
                m++;
            }
        } else {
            //Left has exhausted
            while (l < left.length) {
                mergeArray[m] = left[l];
                l++;
                m++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 11, 4, 14,15, 18, 10, 13};
        int n = arr.length;
        mergeSortImplementation(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));
    }
}
