package ch06.lecture.p7access;

public class C02AccessModifier {
    public static void main(String[] args) {
        C01MyClass o1 = new C01MyClass();
        o1.age = 50; // public
        o1.name = "son"; // package private
//        o1.address = "seoul"; // private

    }
}
