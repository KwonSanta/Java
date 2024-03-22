package ch17.exercise.p7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {

        List<Member> list = Arrays.asList(
                new Member("홍길동", "개발자"),
                new Member("김나리", "디자이너"),
                new Member("신용권", "개발자")
        );

        // 방법 1.
        ArrayList<Member> developers1 = list.stream()
                .filter(e -> e.getJob().equals("개발자"))
                .collect(() -> new ArrayList<>(),
                        (c, e) -> c.add(e),
                        (a, b) -> {
                        });

        // 방법 2.
        List<Member> developers2 = list.stream()
                .filter(e -> e.getJob().equals("개발자"))
                .collect(Collectors.toList());

        developers1.stream()
                .forEach(m -> System.out.println(m.getName()));
    }
}
