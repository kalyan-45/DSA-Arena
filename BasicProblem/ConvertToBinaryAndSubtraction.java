import java.util.Scanner;

public class ConvertToBinaryAndSubtraction {
    public static String subtractBits(int decimal1, int decimal2) {
        int q1, r1, q2, r2;
        String ans1 = "";
        String ans2 = "";
        String ans = "";
        while (decimal1 != 0 || decimal2 != 0){
            r1 = decimal1 % 2;
            q1 = decimal1 / 2;
            decimal1 = q1;
            ans1 = r1 + ans1;
            r2 = decimal2 % 2;
            q2 = decimal2 / 2;
            decimal2 = q2;
            ans2 = r2 + ans2;
            ans = ans1 + "\n" + ans2;
        }
        return ans;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        String answer = subtractBits(num1, num2);
        System.out.println(answer);
    }
}
