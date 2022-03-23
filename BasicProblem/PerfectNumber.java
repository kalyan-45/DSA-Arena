import java.util.Scanner;

public class PerfectNumber {
    public static int perfectNumber(int num){
        int sum = 1;
        if (num == 1) {
            return 0;
        }
         for(int i = 2; i < num; i++){
            if(num % i == 0 ){
                sum+= i;
            }
        }
        if(sum == num) {
            return 1;
        }
        return 0;

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int ans = perfectNumber(num);
        boolean isPerfectNumber = false;
        if(ans == 1)
            isPerfectNumber = true;
        System.out.println(isPerfectNumber);

    }
}
