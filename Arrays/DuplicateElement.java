package Arrays;

import java.util.Scanner;

public class DuplicateElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        duplicateElement(arr);
    }
    static void duplicateElement(int[] arr) {
        int dup = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && arr[i] != dup) {
                    dup = arr[i];
                    System.out.println(arr[dup]);
                    break;
                }
            }
        }
    }
}
