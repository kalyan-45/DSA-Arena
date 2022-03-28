package Recursion;

public class SumOfDigit {
    public static int sum(int n){
        //Base Case
        if(n == 0){
            return n;
        }
        int ans = sum(n / 10);
        int rem = n % 10;
        return rem + ans;
    }
    public static void main(String[] args) {
        System.out.println(sum(321));
    }
}
