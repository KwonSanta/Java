package ch04.lecture.p2switch;

import java.util.Random;
import java.util.Scanner;

public class C04RPS {
    public static void main(String[] args) {
        // 가위바위보 게임 만들기
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // 1, 2, 3
        int compuer = rand.nextInt(1, 4);

        int user = 0;
        do {
            System.out.print("가위(1), 바위(2), 보(3)를 선택하세요:");
            user = Integer.parseInt(sc.nextLine());
            if (user > 3) {
                System.out.println("1~3까지의 숫자만 입력해주세요.");
            }
        } while (user > 3);


        // 숫자 -> 가위바위보로 리팩토링
        switch (user) {
            case 1 -> System.out.println("user = 가위");
            case 2 -> System.out.println("user = 바위");
            case 3 -> System.out.println("user = 보");
        }

        // 누가 이겼는지, 비겼는지 메시지 출력
        switch (user) {
            case 1 -> {
                if (compuer == 2) {
                    System.out.println("Computer Win!!!");
                } else if (compuer == 3) {
                    System.out.println("User Win!!!");
                } else {
                    System.out.println("Draw!!!");
                }
            }
            case 2 -> {
                if (compuer == 1) {
                    System.out.println("User Win!!!");
                } else if (compuer == 3) {
                    System.out.println("Computer Win!!!");
                } else {
                    System.out.println("Draw!!!");
                }
            }
            default -> {
                if (compuer == 1) {
                    System.out.println("Computer Win!!!");
                } else if (compuer == 2) {
                    System.out.println("User Win!!!");
                } else {
                    System.out.println("Draw!!!");
                }
            }
        }
    }
}
