package Recursion;

public class BinaryEquivalent {
    public static void main(String[] args) {
        binaryStrings("", 4);
    }
    public static void binaryStrings(String s, int n) {
        //Base case
        if(n == 0) {
            System.out.println(s);
        }else {
            //Recursive call
            binaryStrings(s + "0", n-1);
            binaryStrings(s + "1", n-1);
        }
    }

}
