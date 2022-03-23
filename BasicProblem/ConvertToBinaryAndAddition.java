import java.util.Scanner;

public class ConvertToBinaryAndAddition {
    public static int addBits(int a, int b) {
        int tempAdd, tempCarry;
        while (b != 0){
            tempAdd = a ^ b;
            tempCarry = a & b;
            tempCarry = tempCarry << 1;

            a = tempAdd;
            b = tempCarry;
        }
        return a;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int answer = addBits(num1, num2);
        System.out.println(answer);
    }
}

