package exceptions.task1;

public class CannotDivideBy0Exception extends Exception {
    public CannotDivideBy0Exception() {
        super("Dividing by 0!");
    }
}
