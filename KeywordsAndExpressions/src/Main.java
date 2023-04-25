public class Main {
    public static void main(String[] args) {
        int highScore = 50;
        int health = 100;

        if (highScore < 25){
            highScore = 1000 + highScore;
        }

        if((health < 25) && (highScore > 1000)){
            highScore = highScore - 1000;
        }


    }
}
