package Sorting;

public class BubbleSort {
    public static void descendingOrder (int[] arr, int size) {
        boolean isComplete;
        int swap = 0;
        for (int i = 0; i < size - 1; i++) {
            isComplete = true;
            for (int j = 0; j < size- 1 - i; j++) {
                if(arr[j] < arr[j + 1]) {  //for Ascending order use if (arr[j] > arr[j + 1] { Same }
                    isComplete = false;
                    swap++;
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
        for (int k = 0; k < size; k++) {
            System.out.println(arr[k]);
        }
        System.out.println(swap);
    }

    public static void main(String[] args) {
        int[] arr = {12, 55, 77,33,11, 99};
        int size = arr.length;
        descendingOrder(arr, size);

    }
}