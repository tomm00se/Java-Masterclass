public class IntEqualityPrinter {

    public static void main(String[] args) {
        System.out.println(printEqual(1,1,1));
    }



    public static String printEqual( int x, int y, int z){
        if (x < 0 || y < 0 || z < 0){
            return "Invalid Value";
        }

        if(x == y && x == z && z == y){
            return "All numbers are equal";
        }

        if(x != y && x != z && z != y){
            return "All numbers are different";
        }

        return "Neither all are equal or different";

    }
}
