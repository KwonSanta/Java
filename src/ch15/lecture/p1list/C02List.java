package ch15.lecture.p1list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02List {
    public static void main(String[] args) {
        // List : 데이터의 순서(index) ⭕, 중복 허용 ⭕

        // 빈 리스트 생성
        List<String> list1 = new ArrayList<>();

        // element(요소,원소,아이템) 추가
        list1.add("java");
        list1.add("spring");
//        list1.add(34); // x
        list1.add("react");
        list1.add("css");
        list1.add("spring"); // 중복가능

        // element 읽기(얻기,get)
        String s1 = list1.get(2);
        System.out.println("s1 = " + s1); // react
        String s2 = list1.get(1);
        System.out.println("s2 = " + s2);
        System.out.println("list1.get(4) = " + list1.get(4));

        // 검색 (contains)
        System.out.println(list1.contains("spring")); // true
        System.out.println(list1.contains("java")); // true
        System.out.println(list1.contains("html")); // false

        // 삭제 (remove)
        list1.remove("java"); // 지우고 -> true리턴
        list1.remove("css"); // 지우고 -> true리턴
        list1.remove("html"); // false
        list1.remove("spring"); // 오름차순으로 가장 빠른 index 삭제

        // 전체 탐색
        // #1. 고전적 for
        System.out.println("-----#1. 고전적 for-----");
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }

        // #2. 향상된 for
        System.out.println("-----#2. 향상된 for-----");
        for (String item : list1) {
            System.out.println(item);
        }

        // #3. forEach & lambda
        System.out.println("-----#3. forEach & Lambda-----");
        list1.forEach(System.out::println);
    }
}
