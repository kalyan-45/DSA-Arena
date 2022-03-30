package Searching;

public class MedianOfTwoArray {
    public static int median(int[] arr1, int[] arr2) {
        return (arr1.length + arr2.length) / 2;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,1,1,1,1,1,1};
        int[] arr2 = {1,1,1,1,2,23,3,3,3,};
        System.out.println(median(arr1, arr2));

    }
    }
