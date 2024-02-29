package ch05.lecture.p1array;

import java.util.Scanner;

public class C22Scanner {
    public static void main(String[] args) {
        String s = "your name is lee kang in";
        Scanner sc = new Scanner(s);

        while (sc.hasNext()) {
            String token = sc.next();
            System.out.println(token);
        }
    }
}
