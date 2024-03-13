package ch16.lecture.p1lambda;

import java.util.List;

public class C12StaticMethodReference {
    public static void main(String[] args) {
        C12MyInterface obj1 = (x, y) -> C12OtherClass.method(x, y);
        C12MyInterface obj2 = C12OtherClass::method;

        // 17장 코드 예습
        List<Integer> list = List.of(9, 10, 1, 3, 27)
                .stream()
                .filter(C12OtherClass::isOdd)
                .toList();
        System.out.println(list);
    }
}

class C12OtherClass {
    static boolean isOdd(int n) {
        return n % 2 == 1;
    }

    static int method(int c, int d) {
        System.out.println("아무 실행문 상관없음");
        return 0;
    }
}

@FunctionalInterface
interface C12MyInterface {
    int method(int a, int b);
}
