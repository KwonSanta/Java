package ch12.lecture.p3regex;

public class C05Sample {
    public static void main(String[] args) {

        // _, $, 영문(대소문자), 숫자 조합
        // 단 숫자로 시작하면 안됨

        String p1 = "(?![0-9])[_$a-zA-Z0-9]+$";
        System.out.println("num".matches(p1));
        System.out.println("var7".matches(p1));
        System.out.println("class".matches(p1));
        System.out.println("PI".matches(p1));
        System.out.println("MAX_VALUE".matches(p1));
        System.out.println("7num".matches(p1));
    }
}
