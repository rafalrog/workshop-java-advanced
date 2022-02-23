package exceptions.task1;

public class MainTask1 {

    public static void main(String[] args) throws CannotDivideBy0Exception {

        try {
            Division.divideNumbers(10,5);
        } catch (CannotDivideBy0Exception e) {
            System.out.println("Something wrong");
        } finally {
            System.out.println("RUN ALWAYS");
        }

    }
}
