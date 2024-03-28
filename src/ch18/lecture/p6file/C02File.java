package ch18.lecture.p6file;

import java.io.File;
import java.io.IOException;

public class C02File {
    public static void main(String[] args) throws IOException {

        String path = "temp/output99.text";
        File file = new File(path);

        System.out.println("file.exists() = " + file.exists()); // false
        if (!file.exists()) {
            file.createNewFile();
        }
        System.out.println("file.exists() = " + file.exists()); // true


    }
}
