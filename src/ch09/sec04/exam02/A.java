package ch09.sec04.exam02;

public class A {
    // 메소드
    void useB() {
        // 로컬클래스
        class B {
            // 인스턴스 필드
            int field1 = 1;
            // 스태틱 필드
            static int field2 = 2;

            // 생성자
            B() {
                System.out.println("B-생성자 실행");
            }

            // 인스턴스 메소드
            void method1() {
                System.out.println("B-method1 실행");
            }

            static void method2() {
                System.out.println("B-method2 실행");
            }
        }

        // 로컬 객체 생성
        B b = new B();

        System.out.println(b.field1);
        b.method1();

        System.out.println(B.field2);
        B.method2();
    }
}
