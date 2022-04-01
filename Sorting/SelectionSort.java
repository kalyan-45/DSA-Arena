package Sorting;

public class SelectionSort {
    public static void descendingOrder (int[] arr, int size) {
        for (int i = 0; i < size - 1; i++) {
            int max = arr[i];
            int maxIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] > max) { // for Ascending order use if (arr[j] < max { Same }
                    max = arr[j];
                    maxIndex = j;
                }
            }
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }
        for (int k = 0; k < size; k++) {
            System.out.print(arr[k] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {9, 1, 7, 4};
        descendingOrder(arr, arr.length);
    }
}