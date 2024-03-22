package ch17.sec03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineExample {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("홍길동", 10),
                new Student("신용권", 20),
                new Student("유미선", 30)
        );

        /* 방법 1
        Stream<Student> studentStream = list.stream();
        IntStream scoreStream = studentStream.mapToInt(student -> student.getScore());
        double avg = scoreStream.average().getAsDouble();
        */

        // 방법 2
        double avg = list.stream()
                .mapToInt(Student::getScore)
                .average()
                .getAsDouble();

        System.out.println("avg = " + avg);
    }
}
