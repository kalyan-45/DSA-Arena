package Searching;
import java.util.Arrays;import java.util.Scanner;

public class RotateArray {
     public static void rotateArray(int[] arr, int n, int d) {
      int mod = d % n;

      for (int i = 0; i < n; i++) {
          int ele = arr[(i + mod) % n];
          System.out.println(ele + " ");
      }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        int d = s.nextInt();
        rotateArray(arr, n, d);
    }
}
