package ch12.lecture.p5annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@MyAnnotation4
public class C04Annotation {
    @MyAnnotation4
    public void method1(@MyAnnotation4 String param) {

    }
}

@Target({ElementType.TYPE, ElementType.METHOD, ElementType.PARAMETER})
@interface MyAnnotation4 {

}
