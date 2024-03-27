package ch18.sec03.exam01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {
    public static void main(String[] args) {

        String fileName = "temp/test1.db";

        try (InputStream is = new FileInputStream(fileName)) {

            while (true) {
                int data = is.read();
                if (data == -1) break;
                System.out.println(data);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
