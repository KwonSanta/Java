package ch05.lecture.p1array;

import java.util.Arrays;

public class C13Reference {
    public static void main(String[] args) {

        int[] arr1 = {5, 4};
        int[] arr2 = arr1;

        int[] arr3 = {2, 3};
        int[] arr4 = Arrays.copyOf(arr3, 2);


    }
}
