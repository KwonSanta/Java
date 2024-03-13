package ch09.lecture.p2anonymous;

import java.util.Random;

public class C07Sample {
    public static void main(String[] args) {
        // TODO : null 대신 익명클래스 객체 코드 작성
        Game rpsGame = new Game() {
            @Override
            public void play() {
                String[] rps = {"가위", "바위", "보"};
                int cnt = (int) (Math.random() * 3);
                System.out.println(rps[cnt]);
            }
        };
        rpsGame.play(); // 가위, 바위, 보 중 하나 출력

        Game lottoGame = new Game() {
            @Override
            public void play() {
                int[] lottoNumbers = new int[6];
                for (int i = 0; i < lottoNumbers.length; i++) {
                    boolean isSame = true;
                    while (isSame) {
                        int number = (int) (Math.random() * 45) + 1;
                        for (int j = 0; j < i; j++) {
                            if (lottoNumbers[i] != number) {
                                lottoNumbers[i] = number;
                                isSame = false;
                            } else {

                            }
                        }
                    }
                }

                for (int item : lottoNumbers) {
                    System.out.print(item + " ");
                }
            }
        };
        // 초보자 : 1~45 값 중 하나 출력
        // 중급자 : 1~45 값 중 6개 중복없이 출력
        lottoGame.play(); // 1 ~ 45 까지 숫자 8자리 뽑기
    }
}

interface Game {
    void play();
}