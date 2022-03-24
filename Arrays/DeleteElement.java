package Arrays;

public class DeleteElement {
    public static int deletion(int[] arr, int x) {
        int i;
        int size = arr.length;
        for (i = 0; i < size; i++) {
            if(arr[i] == x) {
                break;
            }
        }
        if(i < size) {
            size -= 1;
            for (int j = i; j < size; j++) {
                arr[j] = arr[j + 1];
            }
        }
        return size;
    }

    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44,55,66,77};
        int x = 77;
        int n = deletion(arr, x);
        for (int k =0; k < n; k++) {
            System.out.println(arr[k]);
        }
    }
}
