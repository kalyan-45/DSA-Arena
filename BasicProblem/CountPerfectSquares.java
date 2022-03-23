public class CountPerfectSquares {
    public static int perfectSquares(int start, int end) {
        int a = (int)(Math.ceil(Math.sqrt(start)));
        int b = (int)(Math.floor(Math.sqrt(end)));
        System.out.println(a + "  " + b);
        return b - a;
    }

    public static void main(String[] args) {
        System.out.println(perfectSquares(10 , 100));
    }

}

