package providerservice.businesslogic;

public class GenericHelper {
    private GenericHelper() {
    }

    public static int doAddition(int number1, int number2) {
        int[] a = new int[3];
        int sum = 0;
        for (int i = 0; i <= a.length; i++) { // BAD
            sum += a[i];
        }
        return number1 + number2;
    } public static int doAddition7(int number1, int number2) {
        return number1 + number2;
    }

    public static int doSubstraction(int number1, int number2) {
        return number1 - number2;
    }

    public static double returnRandomNumber(){
        return Math.random();
    }
}
