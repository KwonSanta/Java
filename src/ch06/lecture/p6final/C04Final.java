package ch06.lecture.p6final;

public class C04Final {
    public static void main(String[] args) {
        // #4. static 필드 변수
        C04MyClass.i = 30;
        C04MyClass.i = 50;

//        C04MyClass.k = 200; // 변경 불가 X
    }
}

class C04MyClass {
    // static field
    static int i;

    // final static field
    // fianl static field 작명 관습 : UPPER_SNAKE_CASE
    final static int K = 100;
    final static int J;
    static final int AMOUNT_OF_MONEY = 300;   // static, final 순서 상관없음!

    static {
        J = 200;
    }
}