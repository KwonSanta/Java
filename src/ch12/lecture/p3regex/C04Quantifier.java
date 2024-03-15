package ch12.lecture.p3regex;

public class C04Quantifier {
    public static void main(String[] args) {
        // 수량자 {n}
        // 정확히 n번
        // {n,m} : n ~ m 번
        // {n,} : n 번 이상
        // + = {1, } : 1번 이상
        // * = {0, }
        // ? = {0,1} : 0번 or 1번

        // #1. {n} : n번
        System.out.println("-----111-----");
        String p1 = "\\d{3}"; // 숫자가 3번와야함
        System.out.println("012".matches(p1));
        System.out.println("892".matches(p1));
        System.out.println("89z".matches(p1)); // false
        System.out.println("6".matches(p1)); // false

        String p2 = "010-\\d{4}-\\d{4}";
        System.out.println("010-1234-9876".matches(p2));
        System.out.println("999-1234-9876".matches(p2)); // false
        System.out.println("010-333-5555".matches(p2)); // false
        System.out.println("010-3333-222".matches(p2)); // false
        System.out.println("01099998888".matches(p2)); // false

        // #2. {n,m} : n ~ m 번
        System.out.println("-----222-----");
        String p3 = "[가-힣]{3,4}";
        System.out.println("손흥민".matches(p3));
        System.out.println("이강인".matches(p3));
        System.out.println("대한민국".matches(p3));
        System.out.println("한국".matches(p3)); // false
        System.out.println("서울특별시".matches(p3)); // false

        // #3. {n,} : n 번 이상
        System.out.println("-----333-----");
        String p4 = "[가-힣]{2,}";
        System.out.println("손흥민".matches(p4));
        System.out.println("이강인".matches(p4));
        System.out.println("대한민국".matches(p4));
        System.out.println("한국".matches(p4));
        System.out.println("서울특별시".matches(p4));

        // 예제
        System.out.println("-------예제------");
        String p5 = "[\\w가-힣]{1,}"; // 영문대소문자와 한글
        System.out.println("한국".matches(p5));
        System.out.println("korea".matches(p5));
        System.out.println("seoul한국".matches(p5));
        System.out.println("souel 한국".matches(p5));

        // #4. ? = {0,1} : 0번 or 1번
        System.out.println("-------444------");
        String p6 = "010-{0,1}\\d{4}-{0,1}\\d{4}";
//        String p7 = "010-?\\d{4}-?\\d{4}"; // p6 == p7
        System.out.println("010-9999-8888".matches(p6));
        System.out.println("01099998888".matches(p6));
        System.out.println("0109999-8888".matches(p6));
        System.out.println("010-99998888".matches(p6));
        System.out.println("010-999-8888".matches(p6)); // false

        // #5. + = {1, } : 1번 이상
        System.out.println("-------555------");
        String p7 = "\\w+";
        System.out.println("983jf_".matches(p7));
        System.out.println("".matches(p7)); // false

        // #6. * : 0번 이상
        System.out.println("-------666------");
        String p8 = "\\w*";
        System.out.println("98723hjaoisdfh".matches(p8));
        System.out.println();
    }
}
