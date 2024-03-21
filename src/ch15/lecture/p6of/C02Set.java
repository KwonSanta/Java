package ch15.lecture.p6of;

import java.util.HashSet;
import java.util.Set;

public class C02Set {
    public static void main(String[] args) {
        Set<String> set1 = Set.of("spring", "java", "css", "react"); // 🙋🏼이때 set은 HashSet이 맞는가?
        System.out.println(set1);

        Set<String> set2 = Set.of("spring", "java", "spring");
    }
}
