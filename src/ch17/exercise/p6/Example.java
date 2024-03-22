package ch17.exercise.p6;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {

        List<Member> list = Arrays.asList(
                new Member("홍길동", 30),
                new Member("신용권", 40),
                new Member("김자바", 26)
        );

        double avg = list.stream()
                .mapToInt(Member::getAge)
                .average()
                .orElse(0);


        System.out.println("평균 나이: " + avg);
    }
}
