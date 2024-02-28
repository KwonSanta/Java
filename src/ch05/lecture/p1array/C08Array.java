package ch05.lecture.p1array;

public class C08Array {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 1, 3, 10, 8, 9, 2, 3};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("---------------");
        // 각 원소를 두배한 값을 출력
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] * 2);
        }

        System.out.println("---------------");
        for (int item : arr) {
            System.out.println(item);
        }

        System.out.println("---------------");
        // 각 원소를 두배한 값으로 교체
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
            System.out.println(arr[i]);
        }
        System.out.println("---------------");
    }
}
