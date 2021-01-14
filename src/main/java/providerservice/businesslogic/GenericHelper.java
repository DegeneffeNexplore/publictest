package providerservice.businesslogic;

public class GenericHelper {
    private GenericHelper() {
    }

    public static int doAddition(int number1, int number2) {
        return number1 + number2;
    }public static int doAddition5(int number1, int number2) {
        return number1 + number2;
    }

    public static int doSubstraction(int number1, int number2) {
        return number1 - number2;
    }

    public static double returnRandomNumber(){
        return Math.random();
    }
}
