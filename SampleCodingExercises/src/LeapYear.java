public class LeapYear {

    public static void main(String[] args) {

        isLeapYear(1700);

    }

    public static boolean isLeapYear (int year) {

        if(year < 1 || year > 9999){
            return false;
        }

        boolean leapYearCheck = (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);

        if(leapYearCheck){
            System.out.println(year + " is a leap year.");
            return true;
        } else {
            System.out.println(year + " is not a leap year.");
            return false;
        }

    }

}
