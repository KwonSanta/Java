package ch05.exercise;

import java.util.Arrays;

public class exercise8 {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };

        int totalSum = 0, cnt = 0;
        double avg = 0;
        for (int[] row : array) {
            cnt += row.length;
            for (int column : row) {
                totalSum += column;
            }
        }
        avg = (double) totalSum / cnt;

        System.out.println(totalSum);
        System.out.println(avg);


        // 17장개념 스트림 활용
        int sum1 = Arrays.stream(array)
                .flatMapToInt(r -> Arrays.stream(r))
                .sum();
        double avg1 = Arrays.stream(array)
                .flatMapToInt(r -> Arrays.stream(r))
                .average()
                .getAsDouble();
        System.out.println("sum = " + totalSum);
    }
}
