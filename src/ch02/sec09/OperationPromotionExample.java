package ch02.sec09;

public class OperationPromotionExample {
    public static void main(String[] args) {

        byte result1 = 10 + 20; // 초기화 시 연산값은 int타입과 상관없음
        System.out.println("result1 = " + result1);

        byte v1 = 10;
        byte v2 = 20;
        int result2 = v1 + v2;
        System.out.println("result2 = " + result2);

        byte v3 = 10;
        int v4 = 100;
        long v5 = 1000L;
        long result3 = v3 + v4 + v5; // 연산은 앞쪽부터 묶음으로 진행
        System.out.println("result3 = " + result3);

        char v6 = 'A';
        char v7 = 1;
        int result4 = v6 + v7;
        System.out.println("result4 = " + result4);
        System.out.println("(char) result4 = " + (char) result4);

        int v8 = 10;
        int result5 = v8 / 4;
        System.out.println("result5 = " + result5);


        // 질문
        int v9 = 10;
        double result6 = v9 / 4;
        System.out.println("result6 = " + result6);

        int v10 = 1;
        int v11 = 2;
        double result7 = (double) v10 / v11;
        System.out.println("result7 = " + result7);
    }
}
