package Practice;

class Person {
    void print() {
        System.out.println("Person클래스의 print()메소드");
    }
}

class Student extends Person {
    @Override
    public void print() {
        System.out.println("Student클래스의 print()메소드");
    }
}

public class practice {
    public static void main(String[] args) {
        Person p1 = new Person();
        Student st1 = new Student();
        Person p2 = new Student();

        System.out.println("p1");
        System.out.println(p1 instanceof Object);
        System.out.println(p2 instanceof Person);
        System.out.println(p1 instanceof Student);

        System.out.println("p2");
        System.out.println(p2 instanceof Object);
        System.out.println(p2 instanceof Person);
        System.out.println(p2 instanceof Student);
    }
}
