package ioandnio.task1;

import java.io.File;

public class Task1 {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\user\\IdeaProjects\\sda-transporeon1\\adv\\java-advanced-development\\target\\classes");
        String[] fileList = file.list();
        for (String name : fileList) {
            System.out.println(name);
        }
    }
}

