package ch08.lecture.p1interface;

public class C04Field {
    public static void main(String[] args) {
        int a = C04MyInterface.AGE;
        System.out.println(C04MyInterface.NAME);
    }
}

interface C04MyInterface {

    // field
    // 모두 public static final : 항상 대문자_스네이크_케이스 작성
    int AGE = 0;
    String NAME = "홍길동";
    String MY_ADRESS = "london";

    // public abstract
    void method1();
}