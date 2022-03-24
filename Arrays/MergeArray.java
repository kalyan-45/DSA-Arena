package Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int[] arr2 = {1, 2, 3, 4};
        int[] arr1 = {5, 6, 7, 11, 9};
        mergeSortedArrays(arr1, arr2);
        mergeSortedArrays2(arr1, arr2);
    }
    static void mergeSortedArrays(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0, start = 1;

        while (i < arr1.length && j < arr2.length) {
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
            System.out.println();
        }
    }
    public static void mergeSortedArrays2(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j])
                System.out.print(arr1[i++] + " ");
            else if (arr2[j] < arr1[i])
                System.out.print(arr2[j++] + " ");
            else {
                System.out.print(arr2[j++] + " ");
                i++;
            }
        }
        while (i < m)
            System.out.print(arr1[i++] + " ");
        while (j < n)
            System.out.print(arr2[j++] + " ");
    }
}
