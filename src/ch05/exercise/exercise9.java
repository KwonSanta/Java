package ch05.exercise;

import java.util.Scanner;

public class exercise9 {
    public static void main(String[] args) {

        int[] scores = new int[3];
        int studentNum = scores.length, sum = 0;
        double avg = 0.0;
        iter:
        while (true) {
            System.out.println("----------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("----------------------------------------------");
            System.out.print("선택> ");
            Scanner sc = new Scanner(System.in);
            int cnt = sc.nextInt();
            switch (cnt) {
                case 1 -> {
                    System.out.println(STR."학생수> \{scores.length}");
                }
                case 2 -> {
                    for (int i = 0; i < scores.length; i++) {
                        System.out.print(STR."scores[\{i}]: ");
                        scores[i] = sc.nextInt();
                    }
                }
                case 3 -> {
                    for (int i = 0; i < scores.length; i++) {
                        System.out.println(STR."scores[\{i}]: \{scores[i]}");
                    }
                }
                case 4 -> {
                    int max = scores[0];
                    for (int item : scores) {
                        if (item > max)
                            max = item;
                        sum += item;
                        avg = (double) sum / scores.length;
                    }
                    // 최고 점수
                    System.out.println(STR."최고 점수: \{max}");
                    // 평균 점수
                    System.out.println(STR."평균 점수: \{avg}");
                }
                case 5 -> {
                    System.out.println("프로그램 종료");
                    break iter;
                }
            }
        }

    }
}
