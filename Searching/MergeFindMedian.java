package Searching;

public class MergeFindMedian {
    public static int findMedian(int[] arr1, int[] arr2) {
        int lengthOfArr1 = arr1.length;
        int lengthOfArr2 = arr2.length;
        int[] arr3 = new int[lengthOfArr1 + lengthOfArr2];
        int k = 0, i = 0, j = 0;
        while (i<lengthOfArr1 && j <lengthOfArr2)
        {
            if (arr1[i] < arr2[j])
                arr3[k++] = arr1[i++];
            else
                arr3[k++] = arr2[j++];
        }
        while (i < lengthOfArr1)
            arr3[k++] = arr1[i++];
        while (j < lengthOfArr2)
            arr3[k++] = arr2[j++];

        for (int n = 0; n < arr3.length; n++) {
            System.out.print(arr3[n] + " ");
        }
        System.out.println();
        int value;
        int size = (arr3.length / 2) - 1;
        System.out.println(size);
        if (arr3.length % 2 == 0) {
            value = ((arr3[size] + arr3[size + 1]) / 2);
            System.out.println(value);
        } else {
            value = arr3[size];
        }
        return value;
    }

    public static void main(String[] args) {
        int[] arr1 = {0, 1, 2, 3, 4, 5, 6};
        int[] arr2 = {3, 10, 15, 20, 23};
        System.out.println(findMedian(arr1, arr2));
    }
}
