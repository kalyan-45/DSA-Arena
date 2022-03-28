package Recursion;

public class ReverseDigit {
    static void reverseNumber(int n) {
        int result = 0;
        int prev = 0;
        int cur;
        while (n != 0) {
            cur = n % 10;
            n /= 10;
            result = result * 10 + cur;

            if((result - cur) /  10 != prev) {
                System.out.println(result);
            } else {
                prev = result;
            }
        }
        System.out.println(result);
   }
    public static void main(String[] args) {
       reverseNumber(10000);
    }
}
