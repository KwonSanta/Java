package ch18.lecture.p1outputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C03Close {
    public static void main(String[] args) {

        // input, output 동일하게 적용
        String fileName = "temp/output3.data";
        OutputStream os = null;
        try {
            os = new FileOutputStream(fileName);
            // 데이터 출력 작업
            os.write(2309);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                os.close(); // 꼭 해야함! 🔥
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
