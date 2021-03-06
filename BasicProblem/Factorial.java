public class Factorial {
    public static int factorial(int n) {
        if(n == 1) return 1;
        if (n == 0) return 1;
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        int answer = factorial(0);
        System.out.println(answer);
    }
}
