package ch09.lecture.p2anonymous;

import ch07.lecture.p8protected.package2.C01Child;

public class C01Anonymous {
    public static void main(String[] args) {
//        C01MyClass obj = new C01MyClass(); // abstract class는 인스턴스 생성 불가
//        C01MyClass obj = new C01Child();
        // @formatter:off
        // 익명클래스의 객체
        C01MyClass obj = new C01MyClass() {};
    }
}
// @formatter:off
abstract class C01MyClass {}
//class C01Child extends C01MyClass {}