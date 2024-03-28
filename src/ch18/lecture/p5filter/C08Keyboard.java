package ch18.lecture.p5filter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C08Keyboard {
    public static void main(String[] args) throws IOException {

//        InputStream keyboard = System.in;
//        InputStreamReader isr = new InputStreamReader(keyboard);
//        BufferedReader br = new BufferedReader(isr);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("입력>");
            String line = br.readLine();
            if (line.equals("exit")) {
                break;
            }
            System.out.println("출력 = " + line);
        }

        br.close();
    }
}
