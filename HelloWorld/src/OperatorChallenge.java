public class OperatorChallenge {
    public static void main(String[] args) {

        double lowValue = 20.00d;
        double higherValue = 80.00d;

        double sumOfLowAndHigh = (lowValue + higherValue) * 100.00d;

        double sumRemainderFrom40 = sumOfLowAndHigh % 40.00d;

        boolean isValueZero = (sumRemainderFrom40 == 0.00d) ? true : false;

        System.out.println(isValueZero);

        if(!isValueZero){
            System.out.println("got some remainder");
        }

    }
}
