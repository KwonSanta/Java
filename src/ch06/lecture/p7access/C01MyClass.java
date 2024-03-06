package ch06.lecture.p7access;

public class C01MyClass {


    // public field
    public int age;

    // package private
    String name;

    // private field
    private String addess;

    void method1() {
        System.out.println(age);
        System.out.println(addess);
        System.out.println(name);
    }
}
