public class BarkingDog {

    public static void main(String[] args) {

        shouldWakeUp(true,4);

    }

    public static boolean shouldWakeUp (boolean isBarking, int hourOfDay){

        if(isBarking && hourOfDay < 8 && hourOfDay >= 0 || hourOfDay > 22 && hourOfDay <= 23){
            return true;
        } else {
            return false;
        }

    }
}
