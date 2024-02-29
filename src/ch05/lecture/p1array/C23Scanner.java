package ch05.lecture.p1array;

import java.util.Scanner;

public class C23Scanner {
    public static void main(String[] args) {
        String s = "my age is 33 or 44"; // 토큰 6개
        Scanner sc = new Scanner(s);

        System.out.println(sc.next()); // my
        System.out.println(sc.next()); // age
        System.out.println(sc.next()); // is
        System.out.println(sc.nextInt()); // 33
        System.out.println(sc.next()); // or


    }
}
