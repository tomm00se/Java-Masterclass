public class DecimalComparator {

    public static void main(String[] args) {

        areEqualByThreeDecimalPlaces(3.14167, 3.1416);

    }

    public static boolean areEqualByThreeDecimalPlaces (double arg1, double arg2){

        arg1 = arg1  * 1000; // 3.141 becomes 3141.0 (moves up three decimal places)

        arg2 = arg2 * 1000;

        int a1 = (int) arg1; // Turns 3141.0 into 3141 (effectively rounding to an int)

        int b1 = (int) arg2;

        if (a1 == b1) { // Compares the now integers
            return true;
        } else {
            return false;
        }
    }
}
