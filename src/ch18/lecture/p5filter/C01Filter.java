package ch18.lecture.p5filter;

import java.io.*;
import java.util.stream.IntStream;

public class C01Filter {
    public static void main(String[] args) throws IOException {

        // 어떤 I/O Stream 을
        // 다른 I/O Stream 으로 변경해서 사용할 수 있다.

        String file = "temp/output3.txt";
        InputStream is = new FileInputStream(file);

        // 1️⃣ InputStreamReader
        // : byte steam -> character stream 연결
        Reader reader = new InputStreamReader(is);

//        int data1 = is.read();
        int data1 = reader.read();
        System.out.println((char) data1);

    }
}
