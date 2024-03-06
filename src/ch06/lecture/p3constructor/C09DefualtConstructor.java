package ch06.lecture.p3constructor;

public class C09DefualtConstructor {
    public static void main(String[] args) {
        C09MyClass1 obj1 = new C09MyClass1(33);
        C09MyClass2 obj2 = new C09MyClass2();
        C09MyClass3 obj3 = new C09MyClass3();
        C09MyClass4 obj4 = new C09MyClass4(3);
        C09MyClass4 obj5 = new C09MyClass4();
    }
}

class C09MyClass4 {
    int age;

    public C09MyClass4() {
    }

    public C09MyClass4(int age) {
        this.age = age;
    }
}

class C09MyClass3 {
    // 필드 X
    // 생성자 X
    // 생성자를 작성하지 않으면(🔥) -> 파라미터 없는 생성자 자동 추가 (기본 생성자;default constructor;no-args constructor)
    // (🔥) -> 생성자를 작성하면 -> 자동 추가되지 않음
    // 메소드 X
}

class C09MyClass2 {
    public C09MyClass2() {
    }
}

class C09MyClass1 {
    int age;

    public C09MyClass1(int age) {
        this.age = age;
    }
}