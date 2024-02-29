package ch05.lecture.p1array;

import java.util.Scanner;

public class C21Scanner {
    public static void main(String[] args) {
        String s1 = "my name is son.";
        Scanner sc = new Scanner(s1);

        String token1 = sc.next(); // my
        String token2 = sc.next(); // name
        String token3 = sc.next(); // is
        String token4 = sc.next(); // son.

        System.out.println("token1 = " + token1);
        System.out.println("token2 = " + token2);
        System.out.println("token3 = " + token3);
        System.out.println("token4 = " + token4);


    }
}
