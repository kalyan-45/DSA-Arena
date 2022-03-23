import java.util.Scanner;

public class Palindrome {
    public static int palindrome(int num){
        int q, r, rev = 0;
        while(num != 0) {
            q = num / 10;
            r = num % 10;
            rev = rev * 10 + r;
            num = q;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int answer = palindrome(num);
        boolean isPalindrome = false;
        if (answer == num)
            isPalindrome = true;
        System.out.println(isPalindrome);
    }
}
