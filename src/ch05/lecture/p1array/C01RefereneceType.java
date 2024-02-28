package ch05.lecture.p1array;

public class C01RefereneceType {
    public static void main(String[] args) {
        // 기본타입(primitive type) 8개 외는 모두 참조타입
        // 배열 : 여러 값을 갖는 타입
        int a = 3;
        int b = 3;
        System.out.println(a == b); // true

        int[] arr;
        arr = new int[]{3, 4, 5};

        int[] brr;
        brr = new int[]{3, 4, 5};
        System.out.println(arr == brr); // false


    }
}
