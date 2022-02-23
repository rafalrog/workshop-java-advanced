package exceptions.task1;

public class Division {

    public static double divideNumbers(double a, double b) throws CannotDivideBy0Exception {
        if (b == 0) {
            throw new CannotDivideBy0Exception();
        }
        return a / b;
    }
}
