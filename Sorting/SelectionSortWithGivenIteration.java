package Sorting;

public class SelectionSortWithGivenIteration {
    public static void iThIteration (int[] arr, int n) {
        if (n != 0) {
            int iterations = 0;
            for (int i = 0; i < arr.length - 1; i++) {
                int min = arr[i];
                int minIndex = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < min) {
                        min = arr[j];
                        minIndex = j;
                    }
                }
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
                iterations++;
                if (iterations == n) {
                    break;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        int[] array = {9, 8, 7, 6, 5, 4, 3};
        int i = 1;
        iThIteration(array, i);
    }
}