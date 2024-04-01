package ch19.lecture.p1network;

import java.io.*;
import java.net.Socket;

public class C03Computer2 {
    public static void main(String[] args) throws IOException {

        // 서버에 연결해서 Socket 만들기
        Socket socket = new Socket("172.30.1.73", 9000);

        // Socket 에서 InputStream 꺼내기
        InputStream is = socket.getInputStream();
        // BufferedInputStream 연결
        BufferedInputStream bis = new BufferedInputStream(is);

        // 파일명 아무거나
        File file = new File("temp/dir3/photo2.png");
        // Socket 에서 InputStream 꺼내기
        if (!file.exists()) {
            file.getParentFile().mkdirs();
        }

        // FileOutputStream 만들기
        FileOutputStream fos = new FileOutputStream(file);
        // BufferedOutputStream 연결
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        // BufferedInputStream 에서 읽은 데이터
        // BufferedOutputStream 으로 쓰기
        int len = 0;
        byte[] data = new byte[10];
        while ((len = bis.read(data)) != -1) {
            bos.write(data, 0, len);
        }
        // 마지막에 flush
        bos.flush();
        // 끝.
    }
}
