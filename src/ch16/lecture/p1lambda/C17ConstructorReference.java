package ch16.lecture.p1lambda;

public class C17ConstructorReference {
    public static void main(String[] args) {
        C17MyInterface obj1 = () -> new C17MyClass(); //
        C17MyInterface obj2 = C17MyClass::new; //

        C17MyInterface2 obj3 = (s, i) -> new C17MyClass(s, i);
        C17MyInterface2 obj4 = C17MyClass::new;

    }
}

class C17MyClass {
    public C17MyClass() {
    }

    C17MyClass(String s, int i) {

    }
}

@FunctionalInterface
interface C17MyInterface {
    C17MyClass method();
}

@FunctionalInterface
interface C17MyInterface2 {
    C17MyClass method(String s, int i);
}