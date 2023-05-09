public class EqualSumChecker {

    public static void main(String[] args) {

        hasEqualSum(4,4,8); // returns true 4+4 = 8

        hasEqualSum(4,4,10); // returns false 4+4 != 10

    }

    public static boolean hasEqualSum (int a, int b, int c){

        if(a+b == c){
            return true;
        } else {
            return false;
        }

    }

}
