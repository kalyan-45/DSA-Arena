import java.util.Scanner;

public class BinarySubtraction {
    public static int SubBits(int a, int b) {
        while (b != 0){
            int tempCarry = (~a) & b;
            a = a ^ b;
            b = tempCarry << 1;
        }
        return a;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int answer = SubBits(num1, num2);
        System.out.println(answer);
    }
}
