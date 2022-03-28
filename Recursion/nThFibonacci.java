package Recursion;

public class nThFibonacci {
    public static int nThFibo(int n){
        //1. Base case
        if(n == 1){
            return 0;
        }
        if(n == 2) {
            return 1;
        }
        return nThFibo(n-1) + nThFibo(n-2);
    }
    public static void main(String[] args) {
        System.out.println(nThFibo(10));
    }
}
