package ch09.sec03.exam02;

public class AExample {
    public static void main(String[] args) {

        A.B b = new A.B();
        System.out.println(b.field);
        b.method1();

        System.out.println(A.B.field2);
        A.B.method2();
    }
}
