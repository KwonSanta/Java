package ch16.lecture.p1lambda;


public class C14InstanceMethodReference {
    public static void main(String[] args) {
        C14OtherClass obj = new C14OtherClass();
        C14MyInterface lam1 = (a, b) -> a.someMethod(b);
        // 3. 임의 객체의 인스턴스 메소드 참조
        C14MyInterface lam2 = C14OtherClass::someMethod;
    }
}

class C14OtherClass {
    void someMethod(int x) {
        System.out.println("실행문... 중요하지 않음");
    }
}

@FunctionalInterface
interface C14MyInterface {
    void method(C14OtherClass obj, int x);
}