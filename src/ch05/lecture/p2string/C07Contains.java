package ch05.lecture.p2string;

public class C07Contains {
    public static void main(String[] args) {
        String s1 = "my name is son";
        String s2 = "my name is lee";

        boolean b1 = s1.contains("son");
        boolean b2 = s2.contains("son");

        System.out.println("b1 = " + b1); // true
        System.out.println("b2 = " + b2); // false

        String s3 = "my name is Son";
        boolean b3 = s3.contains("son");
        System.out.println("b3 = " + b3); // false -> 대소문자 구분
        String s4 = s3.toLowerCase();
        boolean b4 = s4.contains("son");
        System.out.println("b4 = " + b4);
    }
}
