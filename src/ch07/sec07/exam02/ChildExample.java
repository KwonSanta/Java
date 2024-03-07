package ch07.sec07.exam02;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = new Parent();


        parent.method1();
        parent.method2();
//        parent.method3(); // X
    }
}
