package ch05.lecture.p1array;

import java.util.Arrays;

public class C12Arrays {
    public static void main(String[] args) {
        // java.util.Arrays : 유튤리티 클래스

        // toString : 배열을 보기 좋게 String으로 반환
        int[] arr1 = {9, 1, 3, 0, 4};
        System.out.println(arr1);
        System.out.println(Arrays.toString(arr1));

        // sort : 배열을 오름차순으로 정렬
        Arrays.sort(arr1);
        System.out.println(arr1);
        System.out.println(Arrays.toString(arr1));
        // 정렬 전 arr1과 정렬 후 arr1은 같은 힙 공간값인가?

        // fill : 특정값으로 배열 채우기
        int[] arr2 = new int[5];
        System.out.println(Arrays.toString(arr2));
        Arrays.fill(arr2, 23);
        System.out.println(Arrays.toString(arr2));

        // copyOf
        int[] arr3 = {9, 3, 0, 4, 2};
        int[] arr4 = arr3; // 같은 배열을 참조하고 있다
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
        arr4[0] = 10;
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));

        int[] arr5 = {5, 6, 7, 1, 2};
        int[] arr6 = Arrays.copyOf(arr5, arr5.length);
        System.out.println(Arrays.toString(arr5));
        System.out.println(Arrays.toString(arr6));
        arr5[0] = 50;
        System.out.println(Arrays.toString(arr5));
        System.out.println(Arrays.toString(arr6));


    }
}
