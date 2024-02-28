package ch05.lecture.p1array;

public class C06Array {
    public static void main(String[] args) {
        // 배열 전체 탐색
        int[] arr = new int[]{7, 2, 10, 8, -1, 0, 9, 45, 23, 11};

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[i] = " + arr[i]);
        }

        System.out.println("------------------------------");

        // 배열의 길이
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[i] = " + arr[i]);
        }
    }
}
