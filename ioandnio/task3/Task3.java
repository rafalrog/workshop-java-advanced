package ioandnio.task3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;


public class Task3 {

    private static final String MY_PATH =
            "C:\\Users\\user\\IdeaProjects\\sda-transporeon1\\adv\\java-advanced-development\\target\\classes\\file.txt";

    private static final String CONTENT_TO_APPEND = "What's up?!";



    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        String strLine = "";
        try {
            String filename = MY_PATH;
            FileWriter fw = new FileWriter(filename, true);
            fw.write("..something to add...\n");
            fw.close();
            BufferedReader br = new BufferedReader(new FileReader(filename));
            while (strLine != null) {
                stringBuilder.append(strLine);
                stringBuilder.append(System.lineSeparator());
                strLine = br.readLine();
                System.out.println(strLine);
            }
            br.close();
        } catch (IOException ioe) {
            System.err.println("IOException: " + ioe.getMessage());
        }


        System.out.println("\nNIO style");
        try {
            Files.write(Paths.get(MY_PATH), (CONTENT_TO_APPEND + System.lineSeparator()).getBytes(), StandardOpenOption.APPEND);
        } catch (IOException ioe) {
            System.err.println("IOException: " + ioe.getMessage());
        }

    }




}
//    Path path = Paths.get(PATH);
//        try {
//                Files.write(path, "Some text\n".getBytes(), StandardOpenOption.APPEND);
//                } catch (IOException e) {
//                e.printStackTrace();
//                }
