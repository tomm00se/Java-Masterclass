public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, Tim");
        System.out.println("Hello World");

        boolean isAlien = false;
        if(isAlien == true){
            System.out.println("aliens aren't real");
        }

        int topScore = 80;
        if(topScore < 100){
            System.out.println("You got the high score.");
        }


        int secondTopScore = 60;
        if((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greater than second top score and less than 100.");
        }

        if ((topScore > 90) || (secondTopScore <=90)){
            System.out.println("Either or both of the conditions in the if statement is TRUE");
        }

//        int newValue = 50;
//        if(newValue = 50){
//            System.out.println("This is an error.");
//        } test

        int newValue = 50;
        if(newValue == 50){
            System.out.println("This is valid code.");
        }

//        boolean isCar = false;
//        if (isCar = true){ <- it will check for boolean value (boolean test), this is a bool value so will not error out even though it should
//            System.out.println("This is not supposed to happen.");
//        }
        boolean isCar = false;
        if (isCar == true){
            System.out.println("This is using the comparison operator.");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

        if (  isDomestic){
            System.out.println("This is a domestic vehicle.");
        }



    }
}
