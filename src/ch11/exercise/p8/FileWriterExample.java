package ch11.exercise.p8;

import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {

        String fileName = "file.txt";

        try (FileWriter fw = new FileWriter(fileName)) {
            fw.write("Java");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
