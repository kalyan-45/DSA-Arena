package Searching;

public class BinarySearch3 {
  static int frequencyOfElement(int[] arr, int num, int size) {
      int first = firstOccurrence(arr, 0, size-1, num, size);

      if(first == -1)
          return -1;

      int last = lastOccurrence(arr, first, size-1, num, size);

      return last - first + 1;
  }
    static int firstOccurrence(int[] arr, int start, int end, int x, int n)
    {
        if(end >= start)
        {
            int mid = (start + end)/2;
            System.out.println(mid);
            if( ( mid == 0 || x > arr[mid-1]) && arr[mid] == x) {
                return mid;
            }
            else if(x > arr[mid]) {
                return firstOccurrence(arr, (mid + 1), end, x, n);
            }
            else {
                return firstOccurrence(arr, start, (mid - 1), x, n);
            }
        }
        return -1;
    }
    static int lastOccurrence(int[] arr, int start, int end, int x, int n)
    {
        if(end >= start)
        {
            int mid = (start + end)/2;
            System.out.println(mid);
            if( ( mid == n-1 || x < arr[mid+1]) && arr[mid] == x ) {
                return mid;
            }
            else if(x < arr[mid]) {
                return lastOccurrence(arr, start, (mid - 1), x, n);
            }
            else {
                return lastOccurrence(arr, (mid + 1), end, x, n);
            }
        }
        return -1;
  }

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 8, 10, 12, 13, 15, 17, 19};
        int x = 1;
        int n = arr.length;
        System.out.println(frequencyOfElement(arr, x, n));
    }
}