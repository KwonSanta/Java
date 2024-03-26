package ch18.lecture.p1outputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C02OutputStream {
    public static void main(String[] args) throws IOException, InterruptedException {
        OutputStream os = new FileOutputStream("temp/output2.data");

        os.write(29374);
        os.write(9823432);

        Thread.sleep(10_000);

        os.write(329481);
        os.write(2309023);

        os.flush(); // 아직 스트림에 출력되지 않은 데이터들을 강제로 출력
        os.close(); // 꼭 작성해야함🔥🔥🔥
    }
}
