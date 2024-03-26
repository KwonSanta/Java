package Practice;

import ch16.exercise.p6.Function;

public class exercise {
    public static void main(String[] args) {
//        Object obj = (a, b) -> a > b ? a : b;
        Object obj = new Object() {
            int max(int a, int b) {
                return a > b ? a : b;
            }
        };
    }
}
