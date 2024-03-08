package ch07.lecture.p3casting;

public class C05InstanceOf {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a instanceof A); // t
        System.out.println(a instanceof B); // t
        System.out.println(a instanceof C); // f
        System.out.println(a instanceof D); // f
        System.out.println(a instanceof E); // f
        System.out.println(a instanceof F); // f

    }
}

// 코드 자동포매팅 켜기/끄기
// @formatter:off
class A {}
class B extends A{}
class C extends A{}
class D extends B{}

// @formatter:on
class E extends B {
}

class F extends C {
}
