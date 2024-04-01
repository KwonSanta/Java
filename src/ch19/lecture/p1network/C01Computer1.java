package ch19.lecture.p1network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class C01Computer1 {
    public static void main(String[] args) throws IOException {

        // 연결을 기다리는 쪽
        ServerSocket serverSocket = new ServerSocket(9000);
        // socket 생성
        Socket socket = serverSocket.accept(); // 연결 요청하기를 기다림

        try (socket) {
            // 출력 스트릠 데코레이팅 코드...
            OutputStream os = socket.getOutputStream(); // OutputStream은 한글 커버 불가 -> 아래 과정 필요
            OutputStreamWriter osw = new OutputStreamWriter(os); // 문자단위로 쓰기 위해
            BufferedWriter bw = new BufferedWriter(osw); // 효율적으로 쓰기 위해
            PrintWriter pw = new PrintWriter(bw);

            try (os; osw; bw; pw;) {
                pw.println("hello world");
            }
        }

    }
}
