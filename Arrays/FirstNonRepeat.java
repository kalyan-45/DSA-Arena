package Arrays;

import java.util.Scanner;

public class FirstNonRepeat {
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        int answer = firstNonRepeating(arr);
        if (answer != 0)
            System.out.print(answer);
        else
            System.out.print("All elements are repeated");
    }
    static int firstNonRepeating(int[] arr) {
        int i, j;
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    break;
                }
            }
            if (j == arr.length) {
                return arr[i];
            }
        }
        return 0;
    }

}