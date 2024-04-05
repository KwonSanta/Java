package ch12.lecture.p5annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

public class C06Annotation {
    @MyAnnotation6(value = "hello", data = {4, 5})
    String name;

    @MyAnnotation6(value = "hi", data = 6)
    int age;

    @MyAnnotation6(data = 7)
    String address;
}

// MyAnnotation6 작성
@Target({ElementType.FIELD})
@interface MyAnnotation6 {
    String value() default "model";

    int[] data();
}