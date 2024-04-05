package ch05.lecture.p3enum;

public class C01Enum {
    public static void main(String[] args) {

        MyEnum1 v = MyEnum1.VALUE1;
        MyEnum1 x = MyEnum1.VALUE2;
        MyEnum1 y = MyEnum1.VALUE3;
        MyEnum1 z = MyEnum1.VALUE1; // 같은 값을 쓰면 같은 객체
        System.out.println(v == z); // true : 같은 객체


    }
}

enum MyEnum1 {
    VALUE1,
    VALUE2, // UPPER_SNAKE_CASE
    VALUE3,
}