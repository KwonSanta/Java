package ch16.lecture.p1lambda;

import java.util.Arrays;
import java.util.Comparator;

public class C10Sample {
    public static void main(String[] args) {

        // 프로그래머스 : 문자열 내 마음대로 정렬하기
        String[] strings = {"sun", "bed", "car"};
        int n = 1;

        System.out.println("-----sort 전-----");
        System.out.println(Arrays.toString(strings));

        Arrays.sort(strings, (x, y) -> x.charAt(n) - y.charAt(n));


        System.out.println("-----sort 후-----");
        System.out.println();
        System.out.println(Arrays.toString(strings));

    }
}
