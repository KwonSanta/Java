package ch14.lecture.p1thread;

public class C04Thread {
    public static void main(String[] args) {
        Thread t = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 30000; i++) {
                    System.out.println(i);
                }
            }
        };
        t.start();

        for (int i = 0; i < 30000; i++) {
            System.err.println(i);
        }
    }
}
