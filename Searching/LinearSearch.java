package Searching;

public class LinearSearch {
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Found");
                return i;
            }
        }
        System.out.println("Failure");
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int key = 6;
        System.out.println("Found element in index-" + linearSearch(arr, key));
    }
}
