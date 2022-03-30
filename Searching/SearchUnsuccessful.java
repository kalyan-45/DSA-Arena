package Searching;

import java.util.Scanner;

public class SearchUnsuccessful {
    public static int getComparison(int[] inputArray, int key) {
        int count = 0;
        for (int j : inputArray) {
            if (j == key) {
                break;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int key = scanner.nextInt();
        System.out.println(getComparison(array, key));
    }
}

