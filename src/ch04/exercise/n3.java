package ch04.exercise;

import java.util.Scanner;

public class n3 {
    public static void main(String[] args) {

        // #5.
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                if (4 * x + 5 * y == 60) {
                    System.out.println(STR."(\{x}, \{y})");
                }
            }
        }

        // #6
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // #7
        Scanner sc = new Scanner(System.in);
        int sum = 0, cnt = 0, n1;
        while (cnt != 4) {
            System.out.println("-----------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("-----------------------------");
            System.out.print("선택>");
            cnt = sc.nextInt(); // 몇번 선택했는지.
            switch (cnt) {
                case 1 -> {
                    System.out.print("예금액>");
                    n1 = sc.nextInt(); // 금액을 얼마를 기입했는지
                    sum += n1;
                }
                case 2 -> {
                    System.out.print("출금액>");
                    n1 = sc.nextInt(); // 금액을 얼마를 기입했는지
                    sum -= n1;
                }
                case 3 -> System.out.println("잔고>" + sum);
                default -> System.out.println("프로그램 종료");
            }
        }
    }
}
