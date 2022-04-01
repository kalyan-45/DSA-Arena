package Sorting;

import java.util.Scanner;

public class SortDescPrintIndicesBubble {
    public static void printIndices (int[] arr) {
        int temp, temp1, pos;
        int[] index = new int[arr.length];

        for (int i = 0; i < index.length; i++) {
            index[i] = i;
        }

        for (int i = 0; i < arr.length -1; i++) {

            for (int j = 0 ; j < arr.length -1 -i; j++) {

                pos = j;

                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    temp1 = index[pos];
                    arr[j] = arr[j + 1];
                    index[pos] = index[pos + 1];
                    arr[j + 1] = temp;
                    index[pos + 1] = temp1;
                }
            }
        }
        for (int j : index) {
            System.out.print(j + " ");
        }
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int j = 0; j < size; j++) {
            array[j] = scanner.nextInt();
        }
        printIndices(array);
    }
}