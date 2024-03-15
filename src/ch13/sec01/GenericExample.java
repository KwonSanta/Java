package ch13.sec01;

import javax.swing.*;

public class GenericExample {
    public static void main(String[] args) {
        Box<String> box1 = new Box<>();
        box1.content = "안녕하세요";
        String str = box1.content;
        System.out.println(str);

        Box<Integer> box2 = new Box<>();
        box2.content = 100; // auto boxing
        int value = box2.content; // auto unboxing
        System.out.println(value);

        // 기본타입으로 타입파라미터 넣을 수 없음 -> wrapper 클래스로 사용
//        BOx<int> box3 = new Box<>();
    }
}
