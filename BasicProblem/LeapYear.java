public class LeapYear {
    public static boolean isLeapYear(int year) {
        boolean isLeapYear = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                isLeapYear = year % 400 == 0;
            }
            isLeapYear = true;
        } else {
            isLeapYear = false;
        }
        return isLeapYear;
    }
        public static void main (String[]args){
            boolean answer = isLeapYear(1992);
            boolean answer2 = isLeapYear(1991);
            System.out.println(answer);
            System.out.println(answer2);

        }
    }