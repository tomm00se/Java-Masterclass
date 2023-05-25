public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes) {
        long days = minutes / 60 / 24;
        long years = days / 365;
        long remainingDays = days % 365;

        if(minutes < 0){
            System.out.println("Invalid Value");
        } else {
            System.out.println(minutes + " min = " + (int) years + " y and " + (int) remainingDays + " d");
        }


    }
}
