package reflection.task1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class MainTask1 {

    public static void main(String[] args) {
        Student student = new Student();

        System.out.println("\nAvailable methods: ");
        Method[] methods = student.getClass().getDeclaredMethods();
        System.out.println(Arrays.toString(methods));

        System.out.println("\nAvailable fields: ");
        Field[] fields = student.getClass().getDeclaredFields();
        System.out.println(Arrays.toString(fields));

        System.out.println("\nAvailable constructors: ");
        Constructor[] constructors = student.getClass().getConstructors();
        System.out.println(Arrays.asList(constructors));
    }
}
