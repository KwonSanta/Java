package ch06.lecture.p7access.package1;

import ch06.lecture.p7access.C01MyClass;

public class C03AccessModifier {
    public static void main(String[] args) {
        C01MyClass o1 = new C01MyClass();
        o1.age = 50; // public
//        o1.name = "son"; // package private -> X
//        o1.address = "seoul"; // private
    }
}
