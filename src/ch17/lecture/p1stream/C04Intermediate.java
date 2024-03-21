package ch17.lecture.p1stream;

import java.util.List;
import java.util.stream.Stream;

public class C04Intermediate {
    public static void main(String[] args) {
        // 중간 연산 (intermediate operation)
        // filter, map, distinct, sorted, peek, limit, skip

        // 중간연산은 최종연산이 있을 떄만 실행
        List<Integer> list = List.of(3, 5, 9, 8, 1, 6, 4);
        Stream<Integer> stream1 = list.stream();
        Stream<Integer> stream2 = stream1.filter(e -> {
            System.out.println(e);
            return true;
        });
        long count = stream2.count(); // 최종연산인 count 를 주석 처리 했을 시 filter() 실행 안됨!!
        System.out.println("프로그램 종료");

        // 중간 Stream 변수 없이 바로 사용
        long count1 = list.stream()
                .filter(e -> {
                    System.out.println(e);
                    return true;
                })
                .count();

        // 최종연산이 종료된 Streamdmㄴ 재사용 불가
//        stream1.count(); // IllegalStatement Exception 발생
    }
}
