package ch07.lecture.p5super;

public class C03Super {
    public static void main(String[] args) {

    }
}

class C03Parent {
    // 파라미터 있는 생성자 만들면
    // 파라미터 없는 생성자가 자동추가 되지 않음 -> 작성 필요
    C03Parent(int age) {

    }

    C03Parent(String name, int age) {

    }
}

class C03Child extends C03Parent {

    public C03Child(int age) {
        // 상위타입의 파라미터 없는 생성자가 없으므로 super()에서 오류남
        // 그래서 파라미터있는 생성자 호출 코드를 명시적으로 작성해야함
//        super(age);
        super("son", 33);
    }
}