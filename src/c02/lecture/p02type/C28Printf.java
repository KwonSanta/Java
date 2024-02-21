package c02.lecture.p02type;

public class C28Printf {
    public static void main(String[] args) {
        // System.out.printf()

        // 파라미터 1개 (print()와 유사)
        System.out.printf("hello world!");

        System.out.println();
        // 파라미터 2개
        // 첫번째 파라미터 문자열에 두번째 파라미터를 포함해서 출력
        System.out.printf("hello %s", "jane");
        System.out.println();

        // 파라미터 2개 이상
        // 첫번쨰 파리미터 문자열에 두번쨰, 세번째, ... 파라미터를 포함해서 출력
        System.out.printf("hello %s and %s", "son", "park");

        System.out.println();

        String a = "son";
        String b = "park";
        System.out.println(STR."hello \{a} and \{b}");  // java21부터

        System.out.println();

        System.out.printf("%s %s - %s", "lee", "kang", "in");
        System.out.println();

        System.out.printf("%s %s %s", "son", "lee", "park");
        System.out.println();
        System.out.printf("%2$s %3$s %1$s", "son", "lee", "park");
        System.out.println();
        System.out.printf("%s %s %s %1$s %3$s %3$s", "son", "lee", "park");
        System.out.println();

        System.out.printf("%10s", "son");
        System.out.println();


    }
}
