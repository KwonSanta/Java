package ch08.lecture.p1interface;

import java.io.Serializable;
import java.lang.constant.Constable;
import java.lang.constant.ConstantDesc;

public class C08String {
    public static void main(String[] args) {
        String s = "java";
        Object o = s;
        Serializable serializable = s;
        CharSequence charSequence = s;
        Comparable comparable = s;
        Constable constable = s;
        ConstantDesc constantDesc = s;
    }
}
