package ch18.lecture.p1outputStream;

import java.io.*;

public class C06EffectivelyFinal {
    public static void main(String[] args) throws IOException {

        String inputFileName = "temp/input5.data";
        String outputFileName = "temp/output5.data";

        InputStream is = new FileInputStream(inputFileName);
        OutputStream os = new FileOutputStream(outputFileName);

        try (is; os) {
            // try with resources 문법에 사용된 변수는 fianl 또는 effectively final 이여야함
//            is = new FileInputStream(inputFileName);
            // 읽는 작업
            is.read();
            // 쓰는 작업
            os.write(23988);
        }


    }
}
