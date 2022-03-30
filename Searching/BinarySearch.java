package Searching;

public class BinarySearch {
    public static int binarySearch(int[] arr, int start, int end, int key) {
        //Base Case
        if (start > end) {
            System.out.println("Failure");
            return -1;
        }
        int mid = (start + end) / 2;
        if (mid == key) {
            System.out.println("Found");
            return mid;
        }
        //Recursive call
        if (key < arr[mid]) {
            //go to left
            return binarySearch(arr, start, mid -1, key);
        } else  {
            //go to right
            return binarySearch(arr, mid + 1, end, key);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2,3, 4, 5, 6,7, 8, 9, 10, 11, 12, 13, 14, 15};
        System.out.println("Element found index at " + binarySearch(arr, 0, arr.length - 1, 13));
    }
}
