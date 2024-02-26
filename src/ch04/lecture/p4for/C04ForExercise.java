package ch04.lecture.p4for;

public class C04ForExercise {
    public static void main(String[] args) {
        /*
         * 0
         * 2
         * 4
         * 6
         * 8
         * */
        for (int i = 0; i < 10; i += 2) {
            System.out.println(i);
        }
        /*
        2
        4
        5
        6
        8
        */
        for (int i = 2; i < 10; i++) {
            System.out.println(i);
        }
        /*
         * 5
         * 4
         * 3
         * 2
         * 1
         * */
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }
    }
}
