package Arrays;

public class ReverseArray {
    public static void reverse(int[] arr) {
        for (int i = 0; i < arr.length/2 ; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 -i];
            arr[arr.length -1 -i] = temp;
        }
        System.out.println("Reversed array is: \n");
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 6, 11, 3};
        reverse(arr);

    }
}
