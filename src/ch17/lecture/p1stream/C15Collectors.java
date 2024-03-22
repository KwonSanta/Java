package ch17.lecture.p1stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class C15Collectors {
    public static void main(String[] args) {

        // 자주 사용하는 Collectors method
        List<String> list = List.of("손흥민-토트넘", "이강인-파리", "오타니-LA");

        // Map = {손흥민:토트넘, 이강인:파리, 오타니:LA}
        Map<String, String> collect = list.stream()
                // 중간연산자 들어가고
                .collect(Collectors.toMap(e -> e.split("-")[0],
                        e -> e.split("-")[1]));
        System.out.println(collect);
    }
}
