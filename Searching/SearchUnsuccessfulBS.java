package Searching;

public class SearchUnsuccessfulBS {
    public static int getComparison (int[] arr, int key) {
        //int size = arr.length;
        return binarySearch(arr, 0, arr.length - 1, key, 0);
    }
    static int binarySearch (int[] arr, int start, int end, int key, int count) {
        int mid = (start + end) / 2;
        if(start > end || arr[mid] == key) {
            return count;
        }
        //recursive call
        if (key < arr[mid]) {
            //goto left
            count++;
            return binarySearch(arr, start,mid -1, key, count);
        } else {
            //goto right
            count++;
            return binarySearch(arr, mid + 1, end, key, count);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(getComparison(arr, 9));
    }
}
