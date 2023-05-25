public class MethodOverloadChallenge {

    public static void main(String[] args) {

        System.out.println("5ft, 8in = " + convertToCentimeters(5,8) + "cm");
        System.out.println("68in = " + convertToCentimeters(68) + "cm");

    }

    public static double convertToCentimeters (int heightInInches){

        return heightInInches * 2.54;

    }

    public static double convertToCentimeters(int heightInFeet, int HeightInInches){

        int feetToInches = heightInFeet * 12;
        int totalInches = feetToInches + HeightInInches;
        return convertToCentimeters(totalInches);

    }
}
