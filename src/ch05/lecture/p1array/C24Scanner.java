package ch05.lecture.p1array;

import java.util.Scanner;

public class C24Scanner {
    public static void main(String[] args) {
        String s = """
                my age 33
                your age 44   
                """;

        Scanner sc = new Scanner(s);
        String t1 = sc.next();  // my
        String t2 = sc.next();  // age
        int t3 = sc.nextInt();  // 33

        System.out.println(t3);

        String line1 = sc.nextLine();
        String line2 = sc.nextLine();
        System.out.println(line1);
        System.out.println(line2);
    }
}
