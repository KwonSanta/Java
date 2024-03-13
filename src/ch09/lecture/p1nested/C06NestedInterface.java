package ch09.lecture.p1nested;

public class C06NestedInterface {
    public static void main(String[] args) {

    }
}

class C06OtherClass implements C06MyClass.C06NestedInterface {
    @Override
    public void someMethod() {
    }
}

class C06MyClass {
    // 중첩클래스, 인터페이스
    interface C06NestedInterface {
        void someMethod();
    }

    // 필드, 생성자, 메소드
    void method1() {
        class LocalClass implements C06NestedInterface {
            @Override
            public void someMethod() {
            }
        }
    }
}