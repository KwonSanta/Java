package ch02.lecture.p02type;

public class C24Operation {
    public static void main(String[] args) {
        // 1. 같은 타입끼리의 연산의 결과는 피연산자의 타입
        int a = 10;
        int b = 10;
        int c = a + b; // 연산 결과 : int

        long d = 10;
        long e = 10;
        int f = (int) (d + e);

        // 2. 다른 타입끼리의 연산의 결과는 큰타입쪽으로 편입
        int g = 10;
        long h = 10;
        long i = g + h;

        int j = 10;
        double k = 3.14;
        double l = j + k;

        // 3. String과 다른 타입간 연산의 결과는 String
        // char과의 연산의 결과는 ???????

        int m = 10;
        String n = "10";
        String o = m + n;
        System.out.println("o = " + o);

        int intN = Integer.parseInt(n);
        System.out.println("intN = " + intN);

    }
}
