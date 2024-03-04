package ch06.lecture.p2method;

public class C03Method {
    public static void main(String[] args) {
        C04Person john = new C04Person();
        C04Person jane = new C04Person();
        john.name = "john";
        jane.name = "jane";

        john.run();     //콘솔에 "john이 달립니다." 출력
        jane.walk();    //콘솔에 "jane이 걷습니다." 출력
    }
}

class C04Person {
    String name;

    void run() {
        System.out.println(name + "이 달립니다.");
    }

    void walk() {
        System.out.println(name + "이 걷습니다.");
    }
}
