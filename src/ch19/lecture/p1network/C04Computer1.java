package ch19.lecture.p1network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class C04Computer1 {
    public static void main(String[] args) throws IOException {

        // 하나의 소켓연결 과정끝나면 실행 종료가 아니라 계속 진행하는 방법

        // ServerSocket 만들기
        ServerSocket serverSocket = new ServerSocket(9000);

        while (true) {// 연결 기다린 후
            // 연결되면 Socket 만들기
            Socket socket = serverSocket.accept();

            Thread t = new Thread(() -> {

                try (socket) {
                    // Socket 에서 OutputStream 꺼내기
                    // BufferedOutputStream 연결
                    OutputStream os = socket.getOutputStream();
                    BufferedOutputStream bos = new BufferedOutputStream(os);

                    try (os; bos;) {
                        // 파일은 아무거나
                        // FileInputStream 만들기
                        // BufferedInputStream 연결
                        File file = new File("temp/dir1/photo1.jpeg");
                        FileInputStream fis = new FileInputStream(file);
                        BufferedInputStream bis = new BufferedInputStream(fis);

                        // BufferedInputStream 으로 읽은 데이터
                        // BufferedOutputStream 으로 출력
                        int len = 0;
                        byte[] data = new byte[10];
                        while ((len = bis.read(data)) != -1) {
                            bos.write(data, 0, len);
                        }
                        // 마지막에 flush
                        bos.flush();
                    } catch (Exception e) {
                        System.err.println("오류: " + socket.getRemoteSocketAddress()); // 서버를 접속 시도한 사람의 주소를 얻어내는 코드
                    }

                    System.out.println("완료: " + socket.getRemoteSocketAddress());
                } catch (Exception e) {
                    System.err.println("오류: " + socket.getRemoteSocketAddress());
                }
            });

            t.start();
        }
        // 끝
    }
}
