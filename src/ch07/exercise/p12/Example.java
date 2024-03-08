package ch07.exercise.p12;

public class Example {
    public static void action(A a) {
//        if (a instanceof C c) {
//            c.method2();
//        }
        if (a instanceof C) {
            C c = (C) a;
            c.method2();
        }
    }

    public static void main(String[] args) {
        action(new A());
        action(new B());
        action(new C());

    }
}
