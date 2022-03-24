package Arrays;

import java.util.Scanner;

public class MaxProduct {
    public static int maxProduct (int[] arr) {
        if( arr.length < 2) {
            return -1;
        }
        if (arr.length == 2){
            return arr[0] * arr[1];
        }
        int prevMax = Math.max(arr[0], arr[1]);
        int curMax = Math.min(arr[0], arr[1]);
        for (int i = 2; i < arr.length; i++) {

            if(arr[i] > prevMax) {
                curMax = prevMax;
                prevMax = arr[i];
            } else if (arr[i] > curMax) {
                curMax = arr[i];
            }
        }
        return prevMax * curMax;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++){
            arr[i] = scanner.nextInt();
        }
        int answer = maxProduct(arr);
        System.out.println(answer);
    }
}
