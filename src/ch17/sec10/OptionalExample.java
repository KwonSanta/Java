package ch17.sec10;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        OptionalDouble o = list.stream()
                .mapToDouble(Integer::intValue)
                .average();
        if (o.isPresent()) {
            System.out.println("방법1_평균: " + o.getAsDouble());
        } else {
            System.out.println("방법1_평균: 0.0");
        }

        // 방법 2
        double avg = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        System.out.println("방법2_평균: " + avg);

        // 방법3
        list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .ifPresent(a -> System.out.println("방법3_평균: " + a));
    }
}
