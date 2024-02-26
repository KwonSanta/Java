package ch04.lecture.p4for;

public class C05ForExercise {
    public static void main(String[] args) {

        /*
         *
         **
         ***
         ****
         *****
         */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("================");
        /*
         *****
         ****
         ***
         **
         *
         */
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("================");

        /*
        *****   //i=0, j=i=0, k=5
        ****#   //i=1, j=i=1, k=4
        ***##   //i=2, j=i=2, k=3
        **###
        *####
        #####
        */
        for (int i = 0; i <= 5; i++) {  // i번쨰 줄
            for (int k = 4 - i; k >= 0; k--) {   // * 개수
                System.out.print("*");
            }
            for (int j = i - 1; j >= 0; j--) {  // # 개수
                System.out.print("#");
            }
            System.out.println();
        }
        /*
         *
         **
         ***
         ****
         *****
         */
        for (int i = 0; i < 5; i++) {  // i번쨰 줄
            for (int k = 4 - i; k >= 0; k--) {   // * 개수
                System.out.print(" ");
            }
            for (int j = i; j >= 0; j--) {  // # 개수
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("======================");

        /*
         *****
         ****
         ***
         **
         *
         */
        for (int i = 0; i <= 5; i++) {  // i번쨰 줄
            for (int k = 0; k <= i; k++) {   //
                System.out.print(" ");
            }
            for (int j = 5 - i; j >= 0; j--) {  //
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("======================");
/*
        0
        01
        012
        0123
        01234
*/
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("=======================");
/*
        1
        12
        123
        1234
        12345
*/
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
        System.out.println("=======================");

/*
        0
        12
        345
        6789
        01234
*/
        int cnt = 0;
        for (int i = 0; i < 5; i++) {       // i번째 줄, j개, cnt값 출력
            for (int j = 0; j <= i; j++) {
                System.out.print(cnt % 10);
                cnt++;
            }
            System.out.println();
        }

        cnt = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(cnt % 10);
                cnt++;
            }
            System.out.println();
        }
    }
}
