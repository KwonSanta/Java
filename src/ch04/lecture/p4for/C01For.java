package ch04.lecture.p4for;

public class C01For {
    public static void main(String[] args) {
        int a = 0;

        while (a < 3) {
            System.out.println("어떤 명령문");
            a++;
        }

        System.out.println("###for문 사용###");
        for (int i = 0; i < 3; i++) {
            System.out.println("어떤 명령문");
        }

    }
}
