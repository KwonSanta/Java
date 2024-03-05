package ch06.lecture.p3constructor;

public class C07This {
    public static void main(String[] args) {

    }
}

class C07Myclass {
    String name;

    void method1() {
        System.out.println(name);
        System.out.println(this.name);
        method2();
        this.method2();
    }

    void method2() {

    }
}
