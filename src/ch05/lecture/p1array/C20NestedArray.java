package ch05.lecture.p1array;

import java.util.Arrays;

public class C20NestedArray {
    public static void main(String[] args) {
        int[] arr1 = new int[]{5, 8, 9};

        int[][] arr2 = {
                {80, 90, 96},
                {76, 88}
        };

        int[][] arr3 = arr2;
        arr3[0][1] = 33;

        System.out.println(arr3[0][1]); // 33
        System.out.println(arr2[0][1]); // 33? 90?

        arr3[1] = arr1;
        System.out.println(arr2[1][1]);

    }
}
