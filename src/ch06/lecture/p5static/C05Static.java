package ch06.lecture.p5static;

public class C05Static {
    public static void main(String[] args) {

    }
}

class C05MyClass {
    // 인스턴스 필드

    // static 필드 (class 변수)
    static int age = 30;
    static double area;

    // static block
    // static 멤버 초기 설정용
    static {
        System.out.println("statement ...");
        System.out.println("statement ...");
        System.out.println("statement ...");
        method1(); // static 멤버끼리는 접근 가능
        area = Math.PI * 10 * 10;
    }
    // 생성자

    // 인스턴스 메소드

    // static 메소드 (class 메소드)
    static void method1() {

    }
}