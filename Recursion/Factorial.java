package Recursion;

public class Factorial {
    public static int factorial(int n){
        //Base Case
        if(n < 0) {
            return -1 ;
        }
        if(n == 0) {
            return 1;
        }
        if(n == 1){
            return 1;
        }
        //Recursive call
        return factorial(n-1) * n;
    }

    public static void main(String[] args) {
        System.out.println(factorial(-5));
    }
}
