import java.util.Scanner;

public class BinaryReverseDecimal {
    public static int reverseBits(int num) {
        String rev ="";
        int product = 1;
        int ans = 0;
        while(num != 0) {
            int rem = num % 2;
            num = num / 2;
            rev = rem + rev;
        }
        for (int i = 0; i <= rev.length() - 1; i++) {
            char ch = rev.charAt(i);
            int bit = (int)ch - 48;
            ans += bit * product;
            product *= 2;
        }
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int answer = reverseBits(num);
        System.out.println(answer);
    }
}