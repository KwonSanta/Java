package ch09.lecture.p1nested;

public class C02InstanceNestedClass {
    public static void main(String[] args) {
//        C02MyClass.C02NestedCLass obj = new C02MyClass.C02NestedCLass(); // x
        C02MyClass obj1 = new C02MyClass();
        C02MyClass.C02NestedCLass obj = obj1.new C02NestedCLass();
    }
}

class C02MyClass {
    //중첩 클래스 (nested class)
    class C02NestedCLass {
        // 필드
        // 생성자
        // 메소드
    }
    // 필드

    // 생성자

    // 메소드
    void method1() {
        C02NestedCLass obj1 = new C02NestedCLass();
    }
}
