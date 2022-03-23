import java.util.Scanner;
import java.util.Arrays;
public class DemoDriver {
    public static void merge(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0, start = 1;

        while (i < arr1.length && j < arr2.length)
        {
            if (arr1[i] < arr2[j])
                arr3[k++] = arr1[i++];
            else
                arr3[k++] = arr2[j++];
        }
        while (i < arr1.length)
            arr3[k++] = arr1[i++];
        while (j < arr2.length)
            arr3[k++] = arr2[j++];


        for (int l = 1; l < arr3.length; l++) {
            if (arr3[l] != arr3[l - 1]) {
                arr3[start++] = arr3[l];
            }
        }
        for (int m = 0; m < start; m++) {
            System.out.print(arr3[m] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {4, 7, 9, 10, 11};
        int[] arr2 = {1,2,5, 9, 10};
        merge(arr1,arr2);
    }
}
