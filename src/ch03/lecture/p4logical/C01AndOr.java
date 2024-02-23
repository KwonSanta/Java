package ch03.lecture.p4logical;

public class C01AndOr {
    public static void main(String[] args) {
        // && : and  (논리곱)
        // || : or   (논리합)

        // 피연산자 갯수 : 2개
        // 피연산자의 타입 : boolean
        // 연산결과의 타입 : boolean

        // &&
        // 피연산자가 모두 true일 때 결과가 true, 나머지는 모두 false

        // ||
        // 피연산자가 모두 false일 때 결과가 false, 나머지 모두 true

        int x = 6;
        int y = 3;

        boolean r1 = x < 10 && y > 1;
        boolean r2 = x == 5 || y == 5;
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
    }
}
