package ch18.sec02.exam02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args) {

        String fileName = "temp/test2.db";

        try {
            OutputStream os = new FileOutputStream(fileName);
            try (os) {
                byte[] array = {10, 20, 30};
                os.write(array);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
