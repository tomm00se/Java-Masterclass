public class SecondsAndMinutes {

    public static void main(String[] args) {

        System.out.println(getDurationString(-3945)); // testcase 3
        System.out.println(getDurationString(-65,45)); // testcase 4
        System.out.println(getDurationString(65,145));
        System.out.println(getDurationString(3945)); // testcase 1
        System.out.println(getDurationString(65,46)); // testcase 2

    }

    public static String getDurationString(int seconds){
        if(seconds < 0){
            return "Invalid data for seconds(" + seconds + "), must be a positive integer value";
        }

        return getDurationString(seconds / 60,seconds % 60);
    }

    public static String getDurationString(int minutes, int seconds){
        if(minutes < 0){
            return "Invalid data for minutes(" + minutes + "), must be a positive integer value";
        }
        if (seconds <=0 || seconds >=59){
            return "Invalid data for seconds(" + seconds + "), must be between 0-59";
        }
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;


        return hours + "h " + remainingMinutes + "m " +  seconds + "s";

    }


}
