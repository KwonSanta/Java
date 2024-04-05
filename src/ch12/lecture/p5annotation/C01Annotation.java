package ch12.lecture.p5annotation;

import java.util.List;

public class C01Annotation {
    public static void main(String[] args) {
        // annotation : 코드의 추가 정보
        // 컴파일러나 프레임워크나 빌드 툴 등 다른 도구들이 사용함

    }
}

@MyAnnotaion1
class MyClass1 {
    @MyAnnotaion1
    private String name;

    @MyAnnotaion1
    MyClass1(
            @MyAnnotaion1
            String name,
            @MyAnnotaion1
            int age) {

    }

    @MyAnnotaion1
    public String method(
            @MyAnnotaion1
            Double param,
            @MyAnnotaion1
            List<?> list) {
        @MyAnnotaion1
        String variable;
        return null;
    }
}

@interface MyAnnotaion1 {

}