package ch15.lecture.p1list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04NestedList {
    public static void main(String[] args) {
        int[][] arr = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };

        System.out.println(arr[1][1]);
        System.out.println(arr[2][2]);
        System.out.println(arr[1][0]);

        // #방법1.
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());
        list.get(0).add(95);
        list.get(0).add(86);
        list.get(1).add(83);
        list.get(1).add(92);
        list.get(1).add(96);
        list.get(2).add(78);
        list.get(2).add(83);
        list.get(2).add(93);
        list.get(2).add(87);
        list.get(2).add(88);

        System.out.println(list.get(1).get(1)); // 92
        System.out.println(list.get(2).get(2)); // 93
        System.out.println(list.get(1).get(0)); // 83

        System.out.println();

        List<List<Integer>> list2 = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            List<Integer> innerList = new ArrayList<>();
            for (int j = 0; j < arr[i].length; j++) {
                innerList.add(arr[i][j]);
            }
            list2.add(innerList);
        }
        for (List<Integer> row : list2) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
