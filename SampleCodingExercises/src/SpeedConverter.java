public class SpeedConverter {
    public static void main(String[] args) {

    }

    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour < 0){
            return -1;
        } else{
            double kmToM = (kilometersPerHour / 1.609);
            return Math.round(kmToM);
        }
    };

    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour < 0){
            System.out.println("Invalid Value");
        } else{
            double kmToM = (kilometersPerHour / 1.609);
            System.out.println(kilometersPerHour + " km/h = " + Math.round(kmToM) + " mi/h");
        };
    }
}
