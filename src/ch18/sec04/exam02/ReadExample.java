package ch18.sec04.exam02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample {
    public static void main(String[] args) throws IOException {

        Reader reader = null;
        reader = new FileReader("temp/test.txt");

        while (true) {
            int data = 0;
            try {
                data = reader.read();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            if (data == -1) {
                break;
            }
            System.out.print((char) data);
        }
        reader.close();
        System.out.println();

        reader = new FileReader("temp/test.txt");
        char[] data = new char[100];
        while (true) {
            int num = reader.read(data);
            if (num == -1) {
                break;
            }
            for (int i = 0; i < num; i++) {
                System.out.print(data[i]);
            }
        }
        reader.close();
    }
}
