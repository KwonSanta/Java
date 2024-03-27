package ch18.lecture.p3writer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C01Writer {
    public static void main(String[] args) {

        // OutputStream : 바이트 단위 출력 스트림
        // Writer : 문자 단위 출력 스트림

        String file1 = "temp/output1.txt";
        try (OutputStream os = new FileOutputStream(file1)) {
            os.write(100);
            os.write(44145); // '걱'을 쓰고 싶은데 앞의 1byte가 날라가고 'q'가 작성됨
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
