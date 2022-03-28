package Recursion;

public class Multiplication {
    public static int multiply(int a, int b){
        // 1. Base case
        if(b == 0){
            return a;
        }
        //2.Recursive Call
        int cloneAns = multiply(a, b-1);
        return cloneAns + a;

    }

    public static void main(String[] args) {
        int ans = multiply(24, 3);
        System.out.println(ans);
    }
}
