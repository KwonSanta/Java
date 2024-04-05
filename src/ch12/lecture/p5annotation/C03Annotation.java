package ch12.lecture.p5annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@MyAnnotation3
public class C03Annotation {
    @MyAnnotation3
    String name;

    @MyAnnotation3
    C03Annotation() {

    }

    @MyAnnotation3
    C03Annotation(String name) {

    }

    @MyAnnotation3
    public void method(
            @MyAnnotation3 String name) {
        @MyAnnotation3
        int variable;
    }

}

@Target({ElementType.METHOD, // @MyAnnotation3을 메소드에만 붙일 수 있게 제한
        ElementType.PARAMETER,
        ElementType.TYPE, // TYPE 은 클래스/인터페이스를 지칭함
        ElementType.FIELD,
        ElementType.CONSTRUCTOR,
        ElementType.LOCAL_VARIABLE})
@interface MyAnnotation3 {
}