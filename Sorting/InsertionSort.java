package Sorting;

public class InsertionSort {
    public static void descendingOrder (int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int pivot = arr[i];
            int j = i - 1;
            while ((j >= 0) && (pivot > arr[j])) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = pivot;
        }
        for (int k : arr) {
            System.out.println(k);
        }
    }
    public static void main(String[] args) {
        int[] arr = {3, 3, 0, 1, 6};
        descendingOrder(arr);
    }
}
