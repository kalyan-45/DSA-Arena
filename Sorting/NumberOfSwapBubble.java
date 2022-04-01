package Sorting;

public class NumberOfSwapBubble {
    public static int swap (int[] arr, int n, int size) {
        boolean isComplete;
        int count = 0;
        for (int i = 0; i < n; i++) {
            isComplete = true;
            for (int j = 0; j < size- 1 - i; j++) {
                if(arr[j] < arr[j + 1]) {  //for Ascending order use if (arr[j] > arr[j + 1] { Same }
                    isComplete = false;
                    //Swap
                    count++;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (isComplete) {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int n = 2;
        int size = arr.length;
        System.out.println(swap(arr, n, size));
    }
}
