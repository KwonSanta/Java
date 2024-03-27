package ch18.sec04.exam01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {
    public static void main(String[] args) {
        String fileName = "temp/test.txt";
        try {
            Writer writer = new FileWriter(fileName);
            try (writer) {
                char a = 'A';
                writer.write(a);
                char b = 'B';
                writer.write(b);

                char[] arr = {'C', 'D', 'E'};
                writer.write(arr);

                writer.write("FGH");
                writer.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
