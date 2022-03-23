public class DecimalToBinary {
    public static void main(String[] args) {
        System.out.println(binaryToDecimal(78));
    }
    public static String binaryToDecimal(int decimal){
        int q, r;
        String ans = "";
        while (decimal != 0){
            q = decimal / 2;
            r = decimal % 2;

            ans = r + ans;
            decimal = q;
        }
        return ans;
    }
}
