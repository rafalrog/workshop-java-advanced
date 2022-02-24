package generics.task2;

class Utils {
    public static <T> int countIf(T[] array, Validator<T> validator) {
        int counter = 0;
        for (T element : array) {
            if (validator.validate(element)) {
                counter++;
            }
        }
        return counter;
        // return (int) Arrays.stream(array).filter(validator).count();
        // Functional Interface Predicate<T> validator
    }
}
