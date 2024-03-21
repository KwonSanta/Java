package ch17.lecture.p1stream;

import java.util.List;

public class C03Terminal {
    public static void main(String[] args) {
        // 최종 연산

        List<String> list = List.of("java", "css", "react", "spring", "hello world");

        // anyMatch : 일치하는게 하나라도 있냐 없냐?
        // boolean 타입 리턴
        boolean hasCss = list.stream()
                .anyMatch(e -> e.equals("css"));
        System.out.println("hasCss = " + hasCss);

        boolean hasJSP = list.stream()
                .anyMatch(e -> e.equals("jsp"));
        System.out.println("hasJSP = " + hasJSP);

        boolean hasBlank = list.stream()
                .anyMatch(e -> e.contains(" "));
        System.out.println("hasBlank = " + hasBlank);

        // allMatch
        // : 모두 연산에 통과하는 지.
        boolean threeAndMore = list.stream()
                .allMatch(e -> e.length() >= 3);
        System.out.println("threeAndMore = " + threeAndMore);

        boolean lessTen = list.stream()
                .allMatch(e -> e.length() < 10);
        System.out.println("lessTen = " + lessTen);
    }
}
