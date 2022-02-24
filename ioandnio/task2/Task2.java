package ioandnio.task2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Task2 {

    private static final String MY_PATH = "C:\\Users\\user\\IdeaProjects\\sda-transporeon1\\adv\\java-advanced-development\\target\\classes\\file.txt";

    public static void main(String[] args) {
        BufferedReader bufferedReader;
        String strLine;
        try {
            bufferedReader = new BufferedReader(new FileReader(MY_PATH));
            while ((strLine = bufferedReader.readLine()) != null) {
                System.out.println(strLine);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }



        System.out.println("\nNIO style");
        try (Stream<String> stream = Files.lines(Paths.get(MY_PATH))) {
            stream.forEach(System.out::println);
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }

    }
}

