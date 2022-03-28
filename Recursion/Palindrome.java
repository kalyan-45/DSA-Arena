package Recursion;

import java.util.Scanner;

public class Palindrome {
    public static int palindromeOrNot(int n, int i)  {
        //Base Case
        if (n == 0) {
            return i;
        }
        //Recursive case
        i = (i * 10) + (n % 10);
        return palindromeOrNot(n / 10, i);
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int answer = palindromeOrNot(num, 0);
        boolean isPalindrome = false;
        if (answer == num)
            isPalindrome = true;
        System.out.println(isPalindrome);
    }
}
