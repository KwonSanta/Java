package ch12.lecture.p2wrapper;

public class C02WrapperClass {
    public static void main(String[] args) {
        int a = 3;
        long b = a;

        Integer c = a; // auto boxing
//        Long d = a; // x
        Number e = a;
        Object f = a;
    }
}
