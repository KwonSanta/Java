package ch06.lecture.p3constructor;

public class C04Constructor {
    public static void main(String[] args) {
        C04Myclass obj1 = new C04Myclass("son", 33);
        C04Myclass obj2 = new C04Myclass("lee", 22);

        System.out.println(obj1.name + ", " + obj1.age);
        System.out.println(obj2.name + ", " + obj2.age);

    }
}

class C04Myclass {
    String name;
    int age;

    C04Myclass(String initialName, int initialAge) {
        name = initialName;
        age = initialAge;
    }
}