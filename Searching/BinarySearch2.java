package Searching;

public class BinarySearch2 {
    public static int frequencyOfElement (int[] arr, int key) {
        int first = firstOccurrence(arr, 0, arr.length - 1, key);
        //if first occurrence method hit the fail base case.
        if (first == -1) {
            return -1;
        }
     int last = lastOccurrence(arr, 0, arr.length - 1, key);
        return last - first + 1;
    }
    public static int firstOccurrence(int[] arr, int start, int end, int key) {
        if(end >= start) {
            /*low + (high - low)/2;*/
            int mid = (start + end) / 2;
            if ((mid == 0 || key > arr[mid - 1]) && arr[mid] == key) {
                return mid;
            }
            else  if (key > arr[mid])
                return firstOccurrence(arr, (mid + 1), end, key);
            else
                return firstOccurrence(arr, start, (mid -1), key);
        }
        return -1;
    }
    public static int lastOccurrence (int[] arr, int start, int end, int key) {
        //Base case{
            if(end >= start)
            {
                /*low + (high - low)/2;*/
                int mid = (start + end)/2;
                if( ( mid == arr.length - 1 || key < arr[mid+1]) && arr[mid] == key )
                    return mid;
                else if(key < arr[mid])
                    return lastOccurrence(arr, start, (mid -1), key);
                else
                    return lastOccurrence(arr, (mid + 1), end, key);
            }
            return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 11, 12};
        int key = 13;
        System.out.println(frequencyOfElement(arr, key));
        System.out.println(firstOccurrence(arr, 0, arr.length, key));
        System.out.println(lastOccurrence(arr, 0, arr.length, key));
    }
}
