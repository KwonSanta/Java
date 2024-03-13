package ch16.lecture.p1lambda;

public class C03FunctionalInterface {
    public static void main(String[] args) {

    }
}

//@FunctionalInterface
interface C03MyInterface1 {

}

@FunctionalInterface
interface C03MyInterface2 {
    void method1();
}

//@FunctionalInterface //아님
interface C03MyInterface3 {
    void method2();

    void method3();
}

@FunctionalInterface // ok : 추상메소드의 갯수만 중요
interface C03MyInterface4 {
    void method1();

    default void method2() {

    }
}

@FunctionalInterface // ok :
/*
If an interface declares an abstract method overriding one of the public methods of java.lang.Object
, that also does not count toward the interface's abstract method count since any implementation of the interface
 will have an implementation from java.lang.Object or elsewhere.
*/
interface C03MyInterface5 {
    void method1();

    // Object 클래스의 public 메소드는 포함하지 않음
    String toString();

    int hashCode();

    boolean equals(Object o);
}