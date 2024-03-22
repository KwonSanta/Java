package ch17.exercise.p8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {

        List<Member> list = Arrays.asList(
                new Member("홍길동", "개발자"),
                new Member("김나리", "디자이너"),
                new Member("신용권", "개발자")
        );

        // 내가 푼 답
        Map<String, List<Member>> collect = list.stream()
                .collect(Collectors.groupingBy(Member::getJob));
        System.out.println("[개발자]");
        collect.get("개발자").stream()
                .forEach(System.out::println);
        System.out.println();
        System.out.println("[디자이너]");
        collect.get("디자이너").stream()
                .forEach(System.out::println);

        System.out.println("------------------------------------------------------------------");


    }
}
