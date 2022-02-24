package generics.task2;

public class Task2 {
    public static void main(String[] args) {
        Integer[] array = {7, 8, 33, 44, 2, 55};
        int counter = Utils.countIf(array, el -> el % 2 == 0);
        System.out.println(counter);
    }
}


