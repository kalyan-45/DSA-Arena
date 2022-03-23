import java.util.Scanner;

public class CountBinaryOneInDecimal {
    public static int numberOfSetBits(int num) {
        int count = 0;
        while(num != 0){
            int r = num  % 2;
            if(r == 1) {
                count++;
            }
            num= num / 2;
        }
        return count;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = numberOfSetBits(num);
        System.out.println(count);
    }
}
